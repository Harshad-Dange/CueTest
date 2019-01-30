package com.Utility;

/**
 *
 *
 */
public class AutomationFramework 
{
    public static void initWithGlobalConfiguration(String globalConfigureationFileWithPath)
    {
        Configuration.globalConfiguration().setGlobalConfigurationFile(globalConfigureationFileWithPath);
    }

}
