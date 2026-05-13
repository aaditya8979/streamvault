package t0;

import org.fourthline.cling.support.model.Channel;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AudioRenderServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class e extends gs.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f84594c;

    public e(@NotNull c cVar) {
        p.k(cVar, "audioControl");
        this.f84594c = cVar;
    }

    @Override // ds.m
    @NotNull
    public org.fourthline.cling.model.types.b[] a() {
        return new org.fourthline.cling.model.types.b[]{new org.fourthline.cling.model.types.b(0L)};
    }

    @Override // gs.a
    @NotNull
    public Channel[] c() {
        return new Channel[]{Channel.Master};
    }

    @Override // gs.a
    public boolean e(@NotNull org.fourthline.cling.model.types.b bVar, @NotNull String str) {
        p.k(bVar, "instanceId");
        p.k(str, "channelName");
        return this.f84594c.b(str);
    }

    @Override // gs.a
    @NotNull
    public org.fourthline.cling.model.types.d f(@NotNull org.fourthline.cling.model.types.b bVar, @NotNull String str) {
        p.k(bVar, "instanceId");
        p.k(str, "channelName");
        return this.f84594c.a(str);
    }
}
