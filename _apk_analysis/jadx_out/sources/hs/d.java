package hs;

import org.fourthline.cling.support.model.Channel;

/* JADX INFO: compiled from: ChannelVolumeDB.java */
/* JADX INFO: loaded from: classes8.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Channel f63628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f63629b;

    public d(Channel channel, Integer num) {
        this.f63628a = channel;
        this.f63629b = num;
    }

    public Channel a() {
        return this.f63628a;
    }

    public Integer b() {
        return this.f63629b;
    }

    public String toString() {
        return "VolumeDB: " + b() + " (" + a() + ")";
    }
}
