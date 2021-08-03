package com.github.bamarc.wicketforge.services

import com.github.bamarc.wicketforge.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
