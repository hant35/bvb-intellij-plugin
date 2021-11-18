package com.github.hant35.bvbintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.hant35.bvbintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
