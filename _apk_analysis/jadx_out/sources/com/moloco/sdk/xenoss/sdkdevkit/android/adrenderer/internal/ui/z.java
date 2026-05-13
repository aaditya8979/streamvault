package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public abstract class z {

    @StabilityInferred(parameters = 1)
    public static final class a extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f49274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49276c;

        public a(boolean z10, int i10, int i11) {
            super(null);
            this.f49274a = z10;
            this.f49275b = i10;
            this.f49276c = i11;
        }

        public /* synthetic */ a(boolean z10, int i10, int i11, tn.i iVar) {
            this(z10, i10, i11);
        }

        public final int a() {
            return this.f49276c;
        }

        public final boolean b() {
            return this.f49274a;
        }

        public final int c() {
            return this.f49275b;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class b extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Painter f49277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f49278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f49279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final Shape f49280d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f49281e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Painter painter, String str, long j10, Shape shape, long j11) {
            super(null);
            tn.p.k(painter, "painter");
            tn.p.k(shape, "backgroundShape");
            this.f49277a = painter;
            this.f49278b = str;
            this.f49279c = j10;
            this.f49280d = shape;
            this.f49281e = j11;
        }

        public /* synthetic */ b(Painter painter, String str, long j10, Shape shape, long j11, tn.i iVar) {
            this(painter, str, j10, shape, j11);
        }

        public final long a() {
            return this.f49281e;
        }

        @NotNull
        public final Shape b() {
            return this.f49280d;
        }

        @Nullable
        public final String c() {
            return this.f49278b;
        }

        public final long d() {
            return this.f49279c;
        }

        @NotNull
        public final Painter e() {
            return this.f49277a;
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class c extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f49282a;

        @NotNull
        public final String a() {
            return this.f49282a;
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class d extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f49283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Painter f49284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f49285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f49286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final Shape f49287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f49288f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f49289g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f49290h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f49291i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f49292j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Painter painter, String str2, long j10, Shape shape, long j11, boolean z10, boolean z11, long j12, long j13) {
            super(null);
            tn.p.k(str, "text");
            tn.p.k(painter, "painter");
            tn.p.k(shape, "backgroundShape");
            this.f49283a = str;
            this.f49284b = painter;
            this.f49285c = str2;
            this.f49286d = j10;
            this.f49287e = shape;
            this.f49288f = j11;
            this.f49289g = z10;
            this.f49290h = z11;
            this.f49291i = j12;
            this.f49292j = j13;
        }

        public /* synthetic */ d(String str, Painter painter, String str2, long j10, Shape shape, long j11, boolean z10, boolean z11, long j12, long j13, tn.i iVar) {
            this(str, painter, str2, j10, shape, j11, z10, z11, j12, j13);
        }

        public final long a() {
            return this.f49288f;
        }

        @NotNull
        public final Shape b() {
            return this.f49287e;
        }

        @Nullable
        public final String c() {
            return this.f49285c;
        }

        public final long d() {
            return this.f49292j;
        }

        public final long e() {
            return this.f49291i;
        }

        public final long f() {
            return this.f49286d;
        }

        @NotNull
        public final Painter g() {
            return this.f49284b;
        }

        @NotNull
        public final String h() {
            return this.f49283a;
        }

        public final boolean i() {
            return this.f49289g;
        }

        public final boolean j() {
            return this.f49290h;
        }
    }

    public z() {
    }

    public /* synthetic */ z(tn.i iVar) {
        this();
    }
}
