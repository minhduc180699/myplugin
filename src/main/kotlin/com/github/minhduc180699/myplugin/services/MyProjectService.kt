package com.github.minhduc180699.myplugin.services

import com.intellij.openapi.project.Project
import com.github.minhduc180699.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
