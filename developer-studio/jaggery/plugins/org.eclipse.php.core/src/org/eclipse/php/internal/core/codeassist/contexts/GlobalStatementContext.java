/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Zend Technologies
 *******************************************************************************/
package org.eclipse.php.internal.core.codeassist.contexts;

import org.eclipse.dltk.core.*;
import org.eclipse.php.core.compiler.PHPFlags;
import org.eclipse.php.internal.core.PHPCorePlugin;

/**
 * This context represents state when staying in a top level statement. <br/>
 * Examples:
 * 
 * <pre>
 *  1. |
 *  2. pri|
 *  3. $v|
 *  etc...
 * </pre>
 * 
 * @author michael
 */
public class GlobalStatementContext extends AbstractGlobalStatementContext {

	public boolean isValid(ISourceModule sourceModule, int offset,
			CompletionRequestor requestor) {
		if (!super.isValid(sourceModule, offset, requestor)) {
			return false;
		}

		// check whether enclosing element is not a class
		try {
			IModelElement enclosingElement = sourceModule.getElementAt(offset);
			while (enclosingElement instanceof IField) {
				enclosingElement = enclosingElement.getParent();
			}
			if ((enclosingElement instanceof IMethod)
					|| (enclosingElement instanceof IType && !PHPFlags
							.isNamespace(((IType) enclosingElement).getFlags()))) {
				return false;
			}
		} catch (ModelException e) {
			PHPCorePlugin.log(e);
		}

		return true;
	}
}
