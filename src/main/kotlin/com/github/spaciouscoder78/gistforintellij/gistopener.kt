package com.github.spaciouscoder78.gistforintellij

import com.intellij.ide.BrowserUtil
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

class gistopener: AnAction(){
    override fun actionPerformed(e: AnActionEvent) {
        BrowserUtil.browse("https://gist.github.com")
    }

}