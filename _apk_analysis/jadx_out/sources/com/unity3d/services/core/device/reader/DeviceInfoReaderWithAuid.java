package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Device;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DeviceInfoReaderWithAuid.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DeviceInfoReaderWithAuid implements IDeviceInfoReader {

    @NotNull
    private final IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderWithAuid(@NotNull IDeviceInfoReader iDeviceInfoReader) {
        p.k(iDeviceInfoReader, "_deviceInfoReader");
        this._deviceInfoReader = iDeviceInfoReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    @NotNull
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        p.j(deviceInfoData, "_deviceInfoReader.deviceInfoData");
        String auid = Device.getAuid();
        if (auid != null) {
            deviceInfoData.put("auid", auid);
        }
        return deviceInfoData;
    }
}
