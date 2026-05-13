package com.moloco.sdk.acm.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import cn.w;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
@TypeConverters({a.class})
@Entity(tableName = "events")
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @PrimaryKey(autoGenerate = true)
    public final long f45748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f45749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f45751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Long f45752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<String> f45753f;

    public b(long j10, @NotNull String str, long j11, @NotNull c cVar, @Nullable Long l10, @NotNull List<String> list) {
        p.k(str, "name");
        p.k(cVar, "eventType");
        p.k(list, "tags");
        this.f45748a = j10;
        this.f45749b = str;
        this.f45750c = j11;
        this.f45751d = cVar;
        this.f45752e = l10;
        this.f45753f = list;
    }

    public /* synthetic */ b(long j10, String str, long j11, c cVar, Long l10, List list, int i10, i iVar) {
        this((i10 & 1) != 0 ? 0L : j10, str, j11, cVar, (i10 & 16) != 0 ? null : l10, (i10 & 32) != 0 ? w.m() : list);
    }

    @Nullable
    public final Long a() {
        return this.f45752e;
    }

    @NotNull
    public final c b() {
        return this.f45751d;
    }

    public final long c() {
        return this.f45748a;
    }

    @NotNull
    public final String d() {
        return this.f45749b;
    }

    @NotNull
    public final List<String> e() {
        return this.f45753f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f45748a == bVar.f45748a && p.f(this.f45749b, bVar.f45749b) && this.f45750c == bVar.f45750c && this.f45751d == bVar.f45751d && p.f(this.f45752e, bVar.f45752e) && p.f(this.f45753f, bVar.f45753f);
    }

    public final long f() {
        return this.f45750c;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.f45748a) * 31) + this.f45749b.hashCode()) * 31) + Long.hashCode(this.f45750c)) * 31) + this.f45751d.hashCode()) * 31;
        Long l10 = this.f45752e;
        return ((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31) + this.f45753f.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventEntity(id=" + this.f45748a + ", name=" + this.f45749b + ", timestamp=" + this.f45750c + ", eventType=" + this.f45751d + ", data=" + this.f45752e + ", tags=" + this.f45753f + ')';
    }
}
