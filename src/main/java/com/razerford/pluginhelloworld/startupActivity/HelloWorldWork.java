package com.razerford.pluginhelloworld.startupActivity;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class HelloWorldWork implements StartupActivity {
    @Override
    public void runActivity(@NotNull Project project) {
        Messages.showMessageDialog("Hello world", "Message", Messages.getInformationIcon());
    }
}
