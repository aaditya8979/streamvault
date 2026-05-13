package hs;

import org.fourthline.cling.support.model.Channel;

/* JADX INFO: compiled from: ChannelLoudness.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Channel f63622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f63623b;

    public a(Channel channel, Boolean bool) {
        this.f63622a = channel;
        this.f63623b = bool;
    }

    public Channel a() {
        return this.f63622a;
    }

    public Boolean b() {
        return this.f63623b;
    }

    public String toString() {
        return "Loudness: " + b() + " (" + a() + ")";
    }
}
