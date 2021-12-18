package com.github.qzhangq.mvparmstemplate.services

import com.intellij.openapi.project.Project
import com.github.qzhangq.mvparmstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
