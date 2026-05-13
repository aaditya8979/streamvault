package yads;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes12.dex */
public abstract class of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn.g f93206a = kotlin.b.b(nf.f92852b);

    public static String a(long j10) {
        if (j10 < 1024) {
            return j10 + "B";
        }
        if (j10 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return (j10 / 1024) + "KB";
        }
        if (j10 >= 1073741824) {
            return (j10 / 1073741824) + "GB";
        }
        return (j10 / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) + "MB";
    }
}
