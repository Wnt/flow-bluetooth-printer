# WebBluetooth printer

Vaadin platform Java integration for controlling Bluetooth LE connected receipt printers from the server-side.

[![Demo video on YouTube](https://img.youtube.com/vi/si-oHhtymvs/0.jpg)  
Demo video on YouTube](https://www.youtube.com/watch?v=si-oHhtymvs)

## What do you need?

A browser that support WebBluetooth and a receipt printer that supports Bluetooth LE, like:

- [ZJ-5805](https://nl.aliexpress.com/item/New-Arrival-ZJ-5805-58mm-Bluetooth-4-0-Android-4-0-POS-Receipt-Thermal-Printer-Bill/32793315554.html)
- [AGPtek SC28-AGP](https://www.amazon.com/Version-AGPtek®-Portable-Bluetooth-Wireless/dp/B00XL3DY2E)

## Development instructions

Starting the test/demo server:
```
mvn jetty:run
```

This deploys demo at http://localhost:8080

### Inspired by

Inspired by @NielsLeenheer's [TweetPrinter](https://raw.githubusercontent.com/BluetoothRocks/TweetPrinter). `bluetooth-printer.js` is loaned directly from the TweetPrinter project and `bundle.js` is generated from https://github.com/Wnt/bluetooth-printer. Basically it contains [Broserified](http://browserify.org/) version of the [esc-pos-encoder](https://www.npmjs.com/package/esc-pos-encoder) library and it's dependencies.
