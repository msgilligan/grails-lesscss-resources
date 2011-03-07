class LesscssResourcesGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.5 > *"
    // the other plugins this plugin depends on
    def dependsOn = [resources:'1.0-RC1b > *']
    def loadAfter = ['resources']
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author = "Paul Fairless"
    def authorEmail = ""
    def title = "Less CSS Resources"
    def description = '''\\
This plugin if to support server-side compliation of .less CSS files to their .css counterparts.
'''

    // URL to the plugin's documentation
    def documentation = "https://github.com/paulfairless/grails-lesscss-resources"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}