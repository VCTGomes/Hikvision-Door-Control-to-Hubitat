This driver for Hubitat provides an easy way to unlock doors using the built-in relay of various Hikvision Doorbells via ISAPI and a simple HTTP POST.

Unfortunately, it's not possible to lock, so the lock and unlock buttons will always perform the same action: unlocking the door.

## Installation

### 1. Install the driver.
1.1. On Hubitat, navigate to "Driver code," then click the "+ New Driver" button.
1.2. Click the "Import" button and use the following raw URL to download the code: https://raw.githubusercontent.com/VCTGomes/Hikvision-Door-Controll-to-Hubitat/main/hik-door-lock.groovy
1.3. Save it, and the driver is ready to use!

### 2. Set up the locker
2.1. On Hubitat, go to the Devices page and click "+ Add device."
2.2. On the "Add devices" page, select "Virtual."
2.3. Under "Select device type," choose the driver "Hikvision Door Control."
2.4. Provide a name and assign it to a room.

### 3. Set up the device
3.1. Open the device page.
3.2. In the preferences section of the device, enter the IP Address of the doorbell and its Password.
3.3. Save Preferences.
3.4. You're all set to use it!
