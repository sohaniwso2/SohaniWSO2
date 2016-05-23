/*
 * Copyright 2005,2006 WSO2, Inc. http://www.wso2.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.wsf.ide.core.common.util;

public class NamespaceFinder {
	
	private static final String NS_PREFIX = "http://";
	private static final String SCHEMA_NS_DEFAULT_PREFIX = "xsd";
	private static final String NS_DEFAULT_PREFIX = "ns";
	
	
	public static String getTargetNamespaceFromClass(String fullyQualifiedClassName){
		//tokenize the className
		String[] classNameParts = fullyQualifiedClassName.split("\\.");
		//add the strings in reverse order to make the namespace
		StringBuffer sb=new StringBuffer();
		for(int i=classNameParts.length-2;i>=0;i--){
			sb.append(classNameParts[i]).append((i==0?"":"."));
		}
		
		return NS_PREFIX + sb.toString();	
		
	}
	
	public static String getSchemaTargetNamespaceFromClass(String fullyQualifiedClassName){
		return getTargetNamespaceFromClass(fullyQualifiedClassName);
	}

	public static String getDefaultSchemaNamespacePrefix(){
		return SCHEMA_NS_DEFAULT_PREFIX;
	}
	
	public static String getDefaultNamespacePrefix(){
		return NS_DEFAULT_PREFIX;
	}
	
	public static String getServiceNameText(String fullyQualifiedClassName){
		//Tokenize the className
		String[] classNameParts = fullyQualifiedClassName.split("\\.");
		return classNameParts[classNameParts.length-1];
	}
	
}
