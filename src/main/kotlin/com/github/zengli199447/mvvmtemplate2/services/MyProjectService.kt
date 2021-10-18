package com.github.zengli199447.mvvmtemplate2.services

import com.intellij.openapi.project.Project
import com.github.zengli199447.mvvmtemplate2.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
