package hs;

import org.fourthline.cling.support.model.Channel;

/* JADX INFO: compiled from: ChannelMute.java */
/* JADX INFO: loaded from: classes8.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Channel f63624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f63625b;

    public b(Channel channel, Boolean bool) {
        this.f63624a = channel;
        this.f63625b = bool;
    }

    public Channel a() {
        return this.f63624a;
    }

    public Boolean b() {
        return this.f63625b;
    }

    public String toString() {
        return "Mute: " + b() + " (" + a() + ")";
    }
}
