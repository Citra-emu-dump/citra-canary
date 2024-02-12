// Copyright 2023 Citra Emulator Project
// Licensed under GPLv2 or any later version
// Refer to the license.txt file included.

package org.citra.citra_emu.utils

import android.os.Build

object Log {
    // Tracks whether we should share the old log or the current log
    var gameLaunched = false

    external fun debug(message: String)

    external fun warning(message: String)

    external fun info(message: String)

    external fun error(message: String)

    external fun critical(message: String)

    fun logDeviceInfo() {
        info("Device Manufacturer - ${Build.MANUFACTURER}")
        info("Device Model - ${Build.MODEL}")
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.R) {
            info("SoC Manufacturer - ${Build.SOC_MANUFACTURER}")
            info("SoC Model - ${Build.SOC_MODEL}")
        }
        info("Total System Memory - ${MemoryUtil.getDeviceRAM()}")
    }
}
