metadata {
    definition (name: "Hikvision Door Control", namespace: "vctgomes", author: "vctgomes") {
        capability "Lock"
    }
}

preferences {
    input("ipAddress", "text", title: "IP Address", required: true)
    input("password", "password", title: "Password", required: true)
}

def installed() {
    log.debug "Installed"
    setLockState("locked")
}

def updated() {
    log.debug "Updated"
    setLockState("locked")
}

def unlock() {
    sendCommand("open")
}

def lock() {
    sendCommand("open")
}

def sendCommand(String cmd) {
    def headers = [
        'Content-Type': 'application/xml',
    ]
    def data = "<RemoteControlDoor><cmd>${cmd}</cmd></RemoteControlDoor>"
    def params = [
        uri: "http://admin:${settings.password}@${settings.ipAddress}/ISAPI/AccessControl/RemoteControl/door/1",
        requestContentType: 'application/xml',
        headers: headers,
        body: data
    ]

    try {
        httpPut(params) { response ->
            log.debug "Server response: ${response.status}"
            if (response.status == 200) {
                log.debug "Command sent"
            } else {
                log.error "Command faild: ${response.status}"
            }
        }
    } catch (e) {
        log.error "Fail to sent command: ${e}"
    }
}


