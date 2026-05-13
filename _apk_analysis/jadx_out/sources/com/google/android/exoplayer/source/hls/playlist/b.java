package com.google.android.exoplayer.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: HlsMasterPlaylist.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends k5.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f20573n = new b("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Uri> f20574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<C0291b> f20575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f20576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a> f20577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<a> f20578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f20579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Format f20580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List<Format> f20581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, String> f20582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<DrmInitData> f20583m;

    /* JADX INFO: compiled from: HlsMasterPlaylist.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Uri f20584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Format f20585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f20586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f20587d;

        public a(@Nullable Uri uri, Format format, String str, String str2) {
            this.f20584a = uri;
            this.f20585b = format;
            this.f20586c = str;
            this.f20587d = str2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer.source.hls.playlist.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HlsMasterPlaylist.java */
    public static final class C0291b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f20588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Format f20589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f20590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f20591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f20592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f20593f;

        public C0291b(Uri uri, Format format, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f20588a = uri;
            this.f20589b = format;
            this.f20590c = str;
            this.f20591d = str2;
            this.f20592e = str3;
            this.f20593f = str4;
        }

        public static C0291b b(Uri uri) {
            return new C0291b(uri, Format.r("0", null, "application/x-mpegURL", null, null, -1, 0, 0, null), null, null, null, null);
        }

        public C0291b a(Format format) {
            return new C0291b(this.f20588a, format, this.f20590c, this.f20591d, this.f20592e, this.f20593f);
        }
    }

    public b(String str, List<String> list, List<C0291b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, @Nullable Format format, @Nullable List<Format> list7, boolean z10, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z10);
        this.f20574d = Collections.unmodifiableList(e(list2, list3, list4, list5, list6));
        this.f20575e = Collections.unmodifiableList(list2);
        this.f20576f = Collections.unmodifiableList(list3);
        this.f20577g = Collections.unmodifiableList(list4);
        this.f20578h = Collections.unmodifiableList(list5);
        this.f20579i = Collections.unmodifiableList(list6);
        this.f20580j = format;
        this.f20581k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f20582l = Collections.unmodifiableMap(map);
        this.f20583m = Collections.unmodifiableList(list8);
    }

    public static void a(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f20584a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static <T> List<T> c(List<T> list, int i10, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    StreamKey streamKey = list2.get(i12);
                    if (streamKey.f20359c == i10 && streamKey.f20360d == i11) {
                        arrayList.add(t10);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static b d(String str) {
        return new b("", Collections.emptyList(), Collections.singletonList(C0291b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }

    public static List<Uri> e(List<C0291b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f20588a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(list2, arrayList);
        a(list3, arrayList);
        a(list4, arrayList);
        a(list5, arrayList);
        return arrayList;
    }

    @Override // b5.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b copy(List<StreamKey> list) {
        return new b(this.f72958a, this.f72959b, c(this.f20575e, 0, list), Collections.emptyList(), c(this.f20577g, 1, list), c(this.f20578h, 2, list), Collections.emptyList(), this.f20580j, this.f20581k, this.f72960c, this.f20582l, this.f20583m);
    }
}
