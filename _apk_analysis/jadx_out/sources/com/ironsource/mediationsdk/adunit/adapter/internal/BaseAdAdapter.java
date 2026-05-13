package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.C4324wf;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.c;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseAdAdapter<NetworkAdapter extends AdapterBaseInterface, Listener> {

    @NotNull
    private final LevelPlay.AdFormat mAdFormat;

    @Nullable
    public final UUID mAdUnitObjectId;

    @NotNull
    public final NetworkSettings mNetworkSettings;

    public BaseAdAdapter(@NotNull LevelPlay.AdFormat adFormat, @NotNull NetworkSettings networkSettings) {
        this(adFormat, networkSettings, null);
    }

    public BaseAdAdapter(@NotNull LevelPlay.AdFormat adFormat, @NotNull NetworkSettings networkSettings, @NotNull UUID uuid) {
        this.mAdFormat = adFormat;
        this.mNetworkSettings = networkSettings;
        this.mAdUnitObjectId = uuid;
    }

    @Nullable
    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter networkadapter = (NetworkAdapter) c.b().b(this.mNetworkSettings, C4324wf.b(this.mAdFormat), this.mAdUnitObjectId);
        if (networkadapter != null) {
            return networkadapter;
        }
        return null;
    }

    @NotNull
    public NetworkSettings getNetworkSettings() {
        return this.mNetworkSettings;
    }
}
