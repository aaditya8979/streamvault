package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import io.bidmachine.unified.UnifiedMediationParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
public abstract class j {

    @StabilityInferred(parameters = 1)
    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f50549a;

        public a(int i10) {
            super(null);
            this.f50549a = i10;
        }

        public final int a() {
            return this.f50549a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f50549a == ((a) obj).f50549a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f50549a);
        }

        @NotNull
        public String toString() {
            return "Html(webViewId=" + this.f50549a + ')';
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f50550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f50552c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String str, int i10, int i11) {
            super(null);
            tn.p.k(str, UnifiedMediationParams.KEY_IMAGE_URL);
            this.f50550a = str;
            this.f50551b = i10;
            this.f50552c = i11;
        }

        public final int a() {
            return this.f50552c;
        }

        @NotNull
        public final String b() {
            return this.f50550a;
        }

        public final int c() {
            return this.f50551b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return tn.p.f(this.f50550a, bVar.f50550a) && this.f50551b == bVar.f50551b && this.f50552c == bVar.f50552c;
        }

        public int hashCode() {
            return (((this.f50550a.hashCode() * 31) + Integer.hashCode(this.f50551b)) * 31) + Integer.hashCode(this.f50552c);
        }

        @NotNull
        public String toString() {
            return "Image(imageUrl=" + this.f50550a + ", w=" + this.f50551b + ", h=" + this.f50552c + ')';
        }
    }

    public j() {
    }

    public /* synthetic */ j(tn.i iVar) {
        this();
    }
}
