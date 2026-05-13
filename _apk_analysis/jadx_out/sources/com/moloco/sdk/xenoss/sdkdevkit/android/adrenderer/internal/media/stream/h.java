package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.C3978d4;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
public abstract class h {

    @StabilityInferred(parameters = 0)
    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final File f48285a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull File file) {
            super(null);
            p.k(file, C3978d4.i.f31327b);
            this.f48285a = file;
        }

        @NotNull
        public final File a() {
            return this.f48285a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.f(this.f48285a, ((a) obj).f48285a);
        }

        public int hashCode() {
            return this.f48285a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Complete(file=" + this.f48285a + ')';
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final n.a.AbstractC0607a f48286a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull n.a.AbstractC0607a abstractC0607a) {
            super(null);
            p.k(abstractC0607a, "failure");
            this.f48286a = abstractC0607a;
        }

        @NotNull
        public final n.a.AbstractC0607a a() {
            return this.f48286a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p.f(this.f48286a, ((b) obj).f48286a);
        }

        public int hashCode() {
            return this.f48286a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(failure=" + this.f48286a + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final File f48287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final d f48288b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull File file, @NotNull d dVar) {
            super(null);
            p.k(file, C3978d4.i.f31327b);
            p.k(dVar, "progress");
            this.f48287a = file;
            this.f48288b = dVar;
        }

        @NotNull
        public final File a() {
            return this.f48287a;
        }

        @NotNull
        public final d b() {
            return this.f48288b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p.f(this.f48287a, cVar.f48287a) && p.f(this.f48288b, cVar.f48288b);
        }

        public int hashCode() {
            return (this.f48287a.hashCode() * 31) + this.f48288b.hashCode();
        }

        @NotNull
        public String toString() {
            return "InProgress(file=" + this.f48287a + ", progress=" + this.f48288b + ')';
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48290b;

        public d(long j10, long j11) {
            this.f48289a = j10;
            this.f48290b = j11;
        }

        public final long a() {
            return this.f48289a;
        }

        public final long b() {
            return this.f48290b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f48289a == dVar.f48289a && this.f48290b == dVar.f48290b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f48289a) * 31) + Long.hashCode(this.f48290b);
        }

        @NotNull
        public String toString() {
            return "Progress(bytesDownloaded=" + this.f48289a + ", totalBytes=" + this.f48290b + ')';
        }
    }

    public h() {
    }

    public /* synthetic */ h(tn.i iVar) {
        this();
    }
}
