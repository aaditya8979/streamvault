package hs;

import org.fourthline.cling.support.model.Channel;

/* JADX INFO: compiled from: ChannelVolume.java */
/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Channel f63626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f63627b;

    public c(Channel channel, Integer num) {
        this.f63626a = channel;
        this.f63627b = num;
    }

    public Channel a() {
        return this.f63626a;
    }

    public Integer b() {
        return this.f63627b;
    }

    public String toString() {
        return "Volume: " + b() + " (" + a() + ")";
    }
}
