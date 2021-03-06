package org.jenkinsci.plugins.github.pullrequest.events.impl.GitHubPRLabelExistsEvent

import lib.FormTagLib;

def f = namespace(FormTagLib);

f.entry(field: "skip", title: "Skip pull requests with existing label(s)?") {
    f.checkbox()
}

f.entry() {
    f.property(field: "label")
}
