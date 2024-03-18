This driver for Hubitat provides an easy way to unlock doors using the built-in relay of various Hikvision Doorbells via ISAPI and a simple HTTP POST.

Unfortunately, it's not possible to lock, so the lock and unlock buttons will always perform the same action: unlocking the door.

## Installation

### Install the driver.
1. On Hubitat, navigate to "Driver code," then click the "+ New Driver" button.
1. Click the "Import" button and use the following raw URL to download the code: https://raw.githubusercontent.com/VCTGomes/Hikvision-Door-Control-to-Hubitat/main/hik-door-lock.groovy
1. Save it, and the driver is ready to use!

### Set up the locker
1. On Hubitat, go to the Devices page and click "+ Add device."
1. On the "Add devices" page, select "Virtual."
1. Under "Select device type," choose the driver "Hikvision Door Control."
1. Provide a name and assign it to a room.

### 3. Set up the device 
1. Open the device page.
1. In the preferences section of the device, enter the IP Address of the doorbell and its Password.
1. Save Preferences.
3.4. You're all set to use it!
