package io.bidmachine;

import androidx.annotation.NonNull;
import com.explorestack.protobuf.adcom.ConnectionType;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.protobuf.sdk.Device;
import io.bidmachine.utils.DeviceUtils;

/* JADX INFO: compiled from: DeviceConnectionParams.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y2 {
    @NonNull
    private Context.Device.Connection buildConnection(@NonNull android.content.Context context, @NonNull ConnectionType connectionType) {
        Context.Device.Connection.Builder builderNewBuilder = Context.Device.Connection.newBuilder();
        builderNewBuilder.setType(connectionType);
        builderNewBuilder.setVpn(DeviceUtils.getVpnStatus(context));
        builderNewBuilder.setProxy(DeviceUtils.getProxyStatus(context));
        return builderNewBuilder.build();
    }

    public void build(@NonNull android.content.Context context, @NonNull Context.Device.Builder builder, @NonNull ConnectionType connectionType) {
        builder.setConnection(buildConnection(context, connectionType));
    }

    public void build(@NonNull android.content.Context context, @NonNull Device.Builder builder, @NonNull ConnectionType connectionType) {
        builder.setConnection(buildConnection(context, connectionType));
    }
}
