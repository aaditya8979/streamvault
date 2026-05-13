package com.google.android.exoplayer.trackselection;

import a6.k0;
import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer.trackselection.a;
import com.google.android.exoplayer.trackselection.b;
import com.google.android.exoplayer.trackselection.c;
import e4.q0;
import e4.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class DefaultTrackSelector extends com.google.android.exoplayer.trackselection.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f20761g = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.b f20762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<Parameters> f20763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20764f;

    public static final class Parameters extends TrackSelectionParameters {
        public static final Parcelable.Creator<Parameters> CREATOR;
        public static final Parameters G;

        @Deprecated
        public static final Parameters H;

        @Deprecated
        public static final Parameters I;

        @Deprecated
        public final boolean A;

        @Deprecated
        public final boolean B;
        public final boolean C;
        public final int D;
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> E;
        public final SparseBooleanArray F;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f20765i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f20766j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f20767k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f20768l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f20769m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f20770n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f20771o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f20772p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f20773q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f20774r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f20775s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f20776t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f20777u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final boolean f20778v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f20779w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f20780x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final boolean f20781y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final boolean f20782z;

        public class a implements Parcelable.Creator<Parameters> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Parameters[] newArray(int i10) {
                return new Parameters[i10];
            }
        }

        static {
            Parameters parametersA = new d().a();
            G = parametersA;
            H = parametersA;
            I = parametersA;
            CREATOR = new a();
        }

        public Parameters(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, int i14, int i15, boolean z13, @Nullable String str, int i16, int i17, boolean z14, boolean z15, boolean z16, boolean z17, @Nullable String str2, int i18, boolean z18, int i19, boolean z19, boolean z20, boolean z21, int i20, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(str, str2, i18, z18, i19);
            this.f20765i = i10;
            this.f20766j = i11;
            this.f20767k = i12;
            this.f20768l = i13;
            this.f20769m = z10;
            this.f20770n = z11;
            this.f20771o = z12;
            this.f20772p = i14;
            this.f20773q = i15;
            this.f20774r = z13;
            this.f20775s = i16;
            this.f20776t = i17;
            this.f20777u = z14;
            this.f20778v = z15;
            this.f20779w = z16;
            this.f20780x = z17;
            this.f20781y = z19;
            this.f20782z = z20;
            this.C = z21;
            this.D = i20;
            this.A = z11;
            this.B = z12;
            this.E = sparseArray;
            this.F = sparseBooleanArray;
        }

        public Parameters(Parcel parcel) {
            super(parcel);
            this.f20765i = parcel.readInt();
            this.f20766j = parcel.readInt();
            this.f20767k = parcel.readInt();
            this.f20768l = parcel.readInt();
            this.f20769m = k0.u0(parcel);
            boolean zU0 = k0.u0(parcel);
            this.f20770n = zU0;
            boolean zU02 = k0.u0(parcel);
            this.f20771o = zU02;
            this.f20772p = parcel.readInt();
            this.f20773q = parcel.readInt();
            this.f20774r = k0.u0(parcel);
            this.f20775s = parcel.readInt();
            this.f20776t = parcel.readInt();
            this.f20777u = k0.u0(parcel);
            this.f20778v = k0.u0(parcel);
            this.f20779w = k0.u0(parcel);
            this.f20780x = k0.u0(parcel);
            this.f20781y = k0.u0(parcel);
            this.f20782z = k0.u0(parcel);
            this.C = k0.u0(parcel);
            this.D = parcel.readInt();
            this.E = l(parcel);
            this.F = (SparseBooleanArray) k0.i(parcel.readSparseBooleanArray());
            this.A = zU0;
            this.B = zU02;
        }

        public static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean e(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !f(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean f(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !k0.c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static Parameters h(Context context) {
            return new d(context).a();
        }

        public static SparseArray<Map<TrackGroupArray, SelectionOverride>> l(Parcel parcel) {
            int i10 = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                HashMap map = new HashMap(i13);
                for (int i14 = 0; i14 < i13; i14++) {
                    map.put((TrackGroupArray) a6.a.e((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader())), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(i12, map);
            }
            return sparseArray;
        }

        public static void m(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                Map<TrackGroupArray, SelectionOverride> mapValueAt = sparseArray.valueAt(i10);
                int size2 = mapValueAt.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : mapValueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        @Override // com.google.android.exoplayer.trackselection.TrackSelectionParameters, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.exoplayer.trackselection.TrackSelectionParameters
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            return super.equals(obj) && this.f20765i == parameters.f20765i && this.f20766j == parameters.f20766j && this.f20767k == parameters.f20767k && this.f20768l == parameters.f20768l && this.f20769m == parameters.f20769m && this.f20770n == parameters.f20770n && this.f20771o == parameters.f20771o && this.f20774r == parameters.f20774r && this.f20772p == parameters.f20772p && this.f20773q == parameters.f20773q && this.f20775s == parameters.f20775s && this.f20776t == parameters.f20776t && this.f20777u == parameters.f20777u && this.f20778v == parameters.f20778v && this.f20779w == parameters.f20779w && this.f20780x == parameters.f20780x && this.f20781y == parameters.f20781y && this.f20782z == parameters.f20782z && this.C == parameters.C && this.D == parameters.D && d(this.F, parameters.F) && e(this.E, parameters.E);
        }

        public d g() {
            return new d(this);
        }

        @Override // com.google.android.exoplayer.trackselection.TrackSelectionParameters
        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f20765i) * 31) + this.f20766j) * 31) + this.f20767k) * 31) + this.f20768l) * 31) + (this.f20769m ? 1 : 0)) * 31) + (this.f20770n ? 1 : 0)) * 31) + (this.f20771o ? 1 : 0)) * 31) + (this.f20774r ? 1 : 0)) * 31) + this.f20772p) * 31) + this.f20773q) * 31) + this.f20775s) * 31) + this.f20776t) * 31) + (this.f20777u ? 1 : 0)) * 31) + (this.f20778v ? 1 : 0)) * 31) + (this.f20779w ? 1 : 0)) * 31) + (this.f20780x ? 1 : 0)) * 31) + (this.f20781y ? 1 : 0)) * 31) + (this.f20782z ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D;
        }

        public final boolean i(int i10) {
            return this.F.get(i10);
        }

        @Nullable
        public final SelectionOverride j(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.E.get(i10);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        public final boolean k(int i10, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.E.get(i10);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Override // com.google.android.exoplayer.trackselection.TrackSelectionParameters, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f20765i);
            parcel.writeInt(this.f20766j);
            parcel.writeInt(this.f20767k);
            parcel.writeInt(this.f20768l);
            k0.O0(parcel, this.f20769m);
            k0.O0(parcel, this.f20770n);
            k0.O0(parcel, this.f20771o);
            parcel.writeInt(this.f20772p);
            parcel.writeInt(this.f20773q);
            k0.O0(parcel, this.f20774r);
            parcel.writeInt(this.f20775s);
            parcel.writeInt(this.f20776t);
            k0.O0(parcel, this.f20777u);
            k0.O0(parcel, this.f20778v);
            k0.O0(parcel, this.f20779w);
            k0.O0(parcel, this.f20780x);
            k0.O0(parcel, this.f20781y);
            k0.O0(parcel, this.f20782z);
            k0.O0(parcel, this.C);
            parcel.writeInt(this.D);
            m(parcel, this.E);
            parcel.writeSparseBooleanArray(this.F);
        }
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f20784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f20785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20787f;

        public class a implements Parcelable.Creator<SelectionOverride> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SelectionOverride[] newArray(int i10) {
                return new SelectionOverride[i10];
            }
        }

        public SelectionOverride(int i10, int... iArr) {
            this(i10, iArr, 2, 0);
        }

        public SelectionOverride(int i10, int[] iArr, int i11, int i12) {
            this.f20783b = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f20784c = iArrCopyOf;
            this.f20785d = iArr.length;
            this.f20786e = i11;
            this.f20787f = i12;
            Arrays.sort(iArrCopyOf);
        }

        public SelectionOverride(Parcel parcel) {
            this.f20783b = parcel.readInt();
            int i10 = parcel.readByte();
            this.f20785d = i10;
            int[] iArr = new int[i10];
            this.f20784c = iArr;
            parcel.readIntArray(iArr);
            this.f20786e = parcel.readInt();
            this.f20787f = parcel.readInt();
        }

        public boolean b(int i10) {
            for (int i11 : this.f20784c) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.f20783b == selectionOverride.f20783b && Arrays.equals(this.f20784c, selectionOverride.f20784c) && this.f20786e == selectionOverride.f20786e && this.f20787f == selectionOverride.f20787f;
        }

        public int hashCode() {
            return (((((this.f20783b * 31) + Arrays.hashCode(this.f20784c)) * 31) + this.f20786e) * 31) + this.f20787f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f20783b);
            parcel.writeInt(this.f20784c.length);
            parcel.writeIntArray(this.f20784c);
            parcel.writeInt(this.f20786e);
            parcel.writeInt(this.f20787f);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f20790c;

        public b(int i10, int i11, @Nullable String str) {
            this.f20788a = i10;
            this.f20789b = i11;
            this.f20790c = str;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f20788a == bVar.f20788a && this.f20789b == bVar.f20789b && TextUtils.equals(this.f20790c, bVar.f20790c);
        }

        public int hashCode() {
            int i10 = ((this.f20788a * 31) + this.f20789b) * 31;
            String str = this.f20790c;
            return i10 + (str != null ? str.hashCode() : 0);
        }
    }

    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f20792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Parameters f20793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f20794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20795f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f20796g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f20797h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f20798i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f20799j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f20800k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f20801l;

        public c(Format format, Parameters parameters, int i10) {
            this.f20793d = parameters;
            this.f20792c = DefaultTrackSelector.B(format.B);
            int i11 = 0;
            this.f20794e = DefaultTrackSelector.x(i10, false);
            this.f20795f = DefaultTrackSelector.t(format, parameters.f20833b, false);
            boolean z10 = true;
            this.f20798i = (format.f19921d & 1) != 0;
            int i12 = format.f19940w;
            this.f20799j = i12;
            this.f20800k = format.f19941x;
            int i13 = format.f19923f;
            this.f20801l = i13;
            if ((i13 != -1 && i13 > parameters.f20776t) || (i12 != -1 && i12 > parameters.f20775s)) {
                z10 = false;
            }
            this.f20791b = z10;
            String[] strArrW = k0.W();
            int i14 = Integer.MAX_VALUE;
            int i15 = 0;
            while (true) {
                if (i15 >= strArrW.length) {
                    break;
                }
                int iT = DefaultTrackSelector.t(format, strArrW[i15], false);
                if (iT > 0) {
                    i14 = i15;
                    i11 = iT;
                    break;
                }
                i15++;
            }
            this.f20796g = i14;
            this.f20797h = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int iN;
            int iM;
            boolean z10 = this.f20794e;
            if (z10 != cVar.f20794e) {
                return z10 ? 1 : -1;
            }
            int i10 = this.f20795f;
            int i11 = cVar.f20795f;
            if (i10 != i11) {
                return DefaultTrackSelector.n(i10, i11);
            }
            boolean z11 = this.f20791b;
            if (z11 != cVar.f20791b) {
                return z11 ? 1 : -1;
            }
            if (this.f20793d.f20781y && (iM = DefaultTrackSelector.m(this.f20801l, cVar.f20801l)) != 0) {
                return iM > 0 ? -1 : 1;
            }
            boolean z12 = this.f20798i;
            if (z12 != cVar.f20798i) {
                return z12 ? 1 : -1;
            }
            int i12 = this.f20796g;
            int i13 = cVar.f20796g;
            if (i12 != i13) {
                return -DefaultTrackSelector.n(i12, i13);
            }
            int i14 = this.f20797h;
            int i15 = cVar.f20797h;
            if (i14 != i15) {
                return DefaultTrackSelector.n(i14, i15);
            }
            int i16 = (this.f20791b && this.f20794e) ? 1 : -1;
            int i17 = this.f20799j;
            int i18 = cVar.f20799j;
            if (i17 != i18) {
                iN = DefaultTrackSelector.n(i17, i18);
            } else {
                int i19 = this.f20800k;
                int i20 = cVar.f20800k;
                if (i19 != i20) {
                    iN = DefaultTrackSelector.n(i19, i20);
                } else {
                    if (!k0.c(this.f20792c, cVar.f20792c)) {
                        return 0;
                    }
                    iN = DefaultTrackSelector.n(this.f20801l, cVar.f20801l);
                }
            }
            return i16 * iN;
        }
    }

    public static final class d extends TrackSelectionParameters.b {
        public final SparseBooleanArray A;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20802f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20803g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f20804h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f20805i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f20806j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f20807k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f20808l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f20809m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f20810n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f20811o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f20812p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f20813q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f20814r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f20815s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f20816t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f20817u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f20818v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f20819w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f20820x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f20821y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f20822z;

        @Deprecated
        public d() {
            h();
            this.f20822z = new SparseArray<>();
            this.A = new SparseBooleanArray();
        }

        public d(Context context) {
            super(context);
            h();
            this.f20822z = new SparseArray<>();
            this.A = new SparseBooleanArray();
            m(context, true);
        }

        public d(Parameters parameters) {
            super(parameters);
            this.f20802f = parameters.f20765i;
            this.f20803g = parameters.f20766j;
            this.f20804h = parameters.f20767k;
            this.f20805i = parameters.f20768l;
            this.f20806j = parameters.f20769m;
            this.f20807k = parameters.f20770n;
            this.f20808l = parameters.f20771o;
            this.f20809m = parameters.f20772p;
            this.f20810n = parameters.f20773q;
            this.f20811o = parameters.f20774r;
            this.f20812p = parameters.f20775s;
            this.f20813q = parameters.f20776t;
            this.f20814r = parameters.f20777u;
            this.f20815s = parameters.f20778v;
            this.f20816t = parameters.f20779w;
            this.f20817u = parameters.f20780x;
            this.f20818v = parameters.f20781y;
            this.f20819w = parameters.f20782z;
            this.f20820x = parameters.C;
            this.f20821y = parameters.D;
            this.f20822z = g(parameters.E);
            this.A = parameters.F.clone();
        }

        public static SparseArray<Map<TrackGroupArray, SelectionOverride>> g(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
            }
            return sparseArray2;
        }

        @Override // com.google.android.exoplayer.trackselection.TrackSelectionParameters.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Parameters a() {
            return new Parameters(this.f20802f, this.f20803g, this.f20804h, this.f20805i, this.f20806j, this.f20807k, this.f20808l, this.f20809m, this.f20810n, this.f20811o, this.f20838a, this.f20812p, this.f20813q, this.f20814r, this.f20815s, this.f20816t, this.f20817u, this.f20839b, this.f20840c, this.f20841d, this.f20842e, this.f20818v, this.f20819w, this.f20820x, this.f20821y, this.f20822z, this.A);
        }

        public final void h() {
            this.f20802f = Integer.MAX_VALUE;
            this.f20803g = Integer.MAX_VALUE;
            this.f20804h = Integer.MAX_VALUE;
            this.f20805i = Integer.MAX_VALUE;
            this.f20806j = true;
            this.f20807k = false;
            this.f20808l = true;
            this.f20809m = Integer.MAX_VALUE;
            this.f20810n = Integer.MAX_VALUE;
            this.f20811o = true;
            this.f20812p = Integer.MAX_VALUE;
            this.f20813q = Integer.MAX_VALUE;
            this.f20814r = true;
            this.f20815s = false;
            this.f20816t = false;
            this.f20817u = false;
            this.f20818v = false;
            this.f20819w = false;
            this.f20820x = true;
            this.f20821y = 0;
        }

        public d i(@Nullable String str) {
            super.b(str);
            return this;
        }

        public d j(@Nullable String str) {
            super.c(str);
            return this;
        }

        @Override // com.google.android.exoplayer.trackselection.TrackSelectionParameters.b
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public d d(Context context) {
            super.d(context);
            return this;
        }

        public d l(int i10, int i11, boolean z10) {
            this.f20809m = i10;
            this.f20810n = i11;
            this.f20811o = z10;
            return this;
        }

        public d m(Context context, boolean z10) {
            Point pointG = k0.G(context);
            return l(pointG.x, pointG.y, z10);
        }
    }

    public static final class e implements Comparable<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f20824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f20825d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f20826e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f20827f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f20828g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f20829h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f20830i;

        public e(Format format, Parameters parameters, int i10, @Nullable String str) {
            boolean z10 = false;
            this.f20824c = DefaultTrackSelector.x(i10, false);
            int i11 = format.f19921d & (~parameters.f20837f);
            boolean z11 = (i11 & 1) != 0;
            this.f20825d = z11;
            boolean z12 = (i11 & 2) != 0;
            int iT = DefaultTrackSelector.t(format, parameters.f20834c, parameters.f20836e);
            this.f20827f = iT;
            int iBitCount = Integer.bitCount(format.f19922e & parameters.f20835d);
            this.f20828g = iBitCount;
            this.f20830i = (format.f19922e & 1088) != 0;
            this.f20826e = (iT > 0 && !z12) || (iT == 0 && z12);
            int iT2 = DefaultTrackSelector.t(format, str, DefaultTrackSelector.B(str) == null);
            this.f20829h = iT2;
            if (iT > 0 || ((parameters.f20834c == null && iBitCount > 0) || z11 || (z12 && iT2 > 0))) {
                z10 = true;
            }
            this.f20823b = z10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            boolean z10;
            boolean z11 = this.f20824c;
            if (z11 != eVar.f20824c) {
                return z11 ? 1 : -1;
            }
            int i10 = this.f20827f;
            int i11 = eVar.f20827f;
            if (i10 != i11) {
                return DefaultTrackSelector.n(i10, i11);
            }
            int i12 = this.f20828g;
            int i13 = eVar.f20828g;
            if (i12 != i13) {
                return DefaultTrackSelector.n(i12, i13);
            }
            boolean z12 = this.f20825d;
            if (z12 != eVar.f20825d) {
                return z12 ? 1 : -1;
            }
            boolean z13 = this.f20826e;
            if (z13 != eVar.f20826e) {
                return z13 ? 1 : -1;
            }
            int i14 = this.f20829h;
            int i15 = eVar.f20829h;
            if (i14 != i15) {
                return DefaultTrackSelector.n(i14, i15);
            }
            if (i12 != 0 || (z10 = this.f20830i) == eVar.f20830i) {
                return 0;
            }
            return z10 ? -1 : 1;
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(new a.d());
    }

    public DefaultTrackSelector(Context context) {
        this(context, new a.d());
    }

    public DefaultTrackSelector(Context context, c.b bVar) {
        this(Parameters.h(context), bVar);
    }

    public DefaultTrackSelector(Parameters parameters, c.b bVar) {
        this.f20762d = bVar;
        this.f20763e = new AtomicReference<>(parameters);
    }

    @Deprecated
    public DefaultTrackSelector(c.b bVar) {
        this(Parameters.G, bVar);
    }

    public static void A(b.a aVar, int[][][] iArr, r0[] r0VarArr, com.google.android.exoplayer.trackselection.c[] cVarArr, int i10) {
        boolean z10;
        if (i10 == 0) {
            return;
        }
        boolean z11 = false;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < aVar.c(); i13++) {
            int iD = aVar.d(i13);
            com.google.android.exoplayer.trackselection.c cVar = cVarArr[i13];
            if ((iD == 1 || iD == 2) && cVar != null && C(iArr[i13], aVar.e(i13), cVar)) {
                if (iD == 1) {
                    if (i12 != -1) {
                        z10 = false;
                        break;
                    }
                    i12 = i13;
                } else {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i13;
                }
            }
        }
        z10 = true;
        if (i12 != -1 && i11 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            r0 r0Var = new r0(i10);
            r0VarArr[i12] = r0Var;
            r0VarArr[i11] = r0Var;
        }
    }

    @Nullable
    public static String B(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean C(int[][] iArr, TrackGroupArray trackGroupArray, com.google.android.exoplayer.trackselection.c cVar) {
        if (cVar == null) {
            return false;
        }
        int iC = trackGroupArray.c(cVar.getTrackGroup());
        for (int i10 = 0; i10 < cVar.length(); i10++) {
            if (q0.getTunnelingSupport(iArr[iC][cVar.getIndexInTrackGroup(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public static c.a D(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters) {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        int i11 = parameters.f20771o ? 24 : 16;
        boolean z10 = parameters.f20770n && (i10 & i11) != 0;
        int i12 = 0;
        while (i12 < trackGroupArray2.f20392b) {
            TrackGroup trackGroupB = trackGroupArray2.b(i12);
            int[] iArrS = s(trackGroupB, iArr[i12], z10, i11, parameters.f20765i, parameters.f20766j, parameters.f20767k, parameters.f20768l, parameters.f20772p, parameters.f20773q, parameters.f20774r);
            if (iArrS.length > 0) {
                return new c.a(trackGroupB, iArrS);
            }
            i12++;
            trackGroupArray2 = trackGroupArray;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer.trackselection.c.a G(com.google.android.exoplayer.source.TrackGroupArray r17, int[][] r18, com.google.android.exoplayer.trackselection.DefaultTrackSelector.Parameters r19) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.trackselection.DefaultTrackSelector.G(com.google.android.exoplayer.source.TrackGroupArray, int[][], com.google.android.exoplayer.trackselection.DefaultTrackSelector$Parameters):com.google.android.exoplayer.trackselection.c$a");
    }

    public static int m(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        }
        if (i11 == -1) {
            return 1;
        }
        return i10 - i11;
    }

    public static int n(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public static void o(TrackGroup trackGroup, int[] iArr, int i10, @Nullable String str, int i11, int i12, int i13, int i14, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!z(trackGroup.b(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13, i14)) {
                list.remove(size);
            }
        }
    }

    public static int p(TrackGroup trackGroup, int[] iArr, b bVar, int i10, boolean z10, boolean z11, boolean z12) {
        int i11 = 0;
        for (int i12 = 0; i12 < trackGroup.f20388b; i12++) {
            if (y(trackGroup.b(i12), iArr[i12], bVar, i10, z10, z11, z12)) {
                i11++;
            }
        }
        return i11;
    }

    public static int[] q(TrackGroup trackGroup, int[] iArr, int i10, boolean z10, boolean z11, boolean z12) {
        int iP;
        HashSet hashSet = new HashSet();
        b bVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < trackGroup.f20388b; i12++) {
            Format formatB = trackGroup.b(i12);
            b bVar2 = new b(formatB.f19940w, formatB.f19941x, formatB.f19927j);
            if (hashSet.add(bVar2) && (iP = p(trackGroup, iArr, bVar2, i10, z10, z11, z12)) > i11) {
                i11 = iP;
                bVar = bVar2;
            }
        }
        if (i11 <= 1) {
            return f20761g;
        }
        a6.a.e(bVar);
        int[] iArr2 = new int[i11];
        int i13 = 0;
        for (int i14 = 0; i14 < trackGroup.f20388b; i14++) {
            if (y(trackGroup.b(i14), iArr[i14], bVar, i10, z10, z11, z12)) {
                iArr2[i13] = i14;
                i13++;
            }
        }
        return iArr2;
    }

    public static int r(TrackGroup trackGroup, int[] iArr, int i10, @Nullable String str, int i11, int i12, int i13, int i14, List<Integer> list) {
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            int iIntValue = list.get(i16).intValue();
            if (z(trackGroup.b(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13, i14)) {
                i15++;
            }
        }
        return i15;
    }

    public static int[] s(TrackGroup trackGroup, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11) {
        String str;
        int iR;
        if (trackGroup.f20388b < 2) {
            return f20761g;
        }
        List<Integer> listW = w(trackGroup, i15, i16, z11);
        if (listW.size() < 2) {
            return f20761g;
        }
        if (z10) {
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i17 = 0;
            for (int i18 = 0; i18 < listW.size(); i18++) {
                String str3 = trackGroup.b(listW.get(i18).intValue()).f19927j;
                if (hashSet.add(str3) && (iR = r(trackGroup, iArr, i10, str3, i11, i12, i13, i14, listW)) > i17) {
                    i17 = iR;
                    str2 = str3;
                }
            }
            str = str2;
        }
        o(trackGroup, iArr, i10, str, i11, i12, i13, i14, listW);
        return listW.size() < 2 ? f20761g : k0.I0(listW);
    }

    public static int t(Format format, @Nullable String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(format.B)) {
            return 4;
        }
        String strB = B(str);
        String strB2 = B(format.B);
        if (strB2 == null || strB == null) {
            return (z10 && strB2 == null) ? 1 : 0;
        }
        if (strB2.startsWith(strB) || strB.startsWith(strB2)) {
            return 3;
        }
        return k0.E0(strB2, "-")[0].equals(k0.E0(strB, "-")[0]) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point u(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = a6.k0.k(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = a6.k0.k(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.trackselection.DefaultTrackSelector.u(boolean, int, int, int, int):android.graphics.Point");
    }

    public static List<Integer> w(TrackGroup trackGroup, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(trackGroup.f20388b);
        for (int i13 = 0; i13 < trackGroup.f20388b; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < trackGroup.f20388b; i15++) {
                Format formatB = trackGroup.b(i15);
                int i16 = formatB.f19932o;
                if (i16 > 0 && (i12 = formatB.f19933p) > 0) {
                    Point pointU = u(z10, i10, i11, i16, i12);
                    int i17 = formatB.f19932o;
                    int i18 = formatB.f19933p;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (pointU.x * 0.98f)) && i18 >= ((int) (pointU.y * 0.98f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iE = trackGroup.b(((Integer) arrayList.get(size)).intValue()).E();
                    if (iE == -1 || iE > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean x(int i10, boolean z10) {
        int formatSupport = q0.getFormatSupport(i10);
        return formatSupport == 4 || (z10 && formatSupport == 3);
    }

    public static boolean y(Format format, int i10, b bVar, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        String str;
        int i13;
        if (!x(i10, false)) {
            return false;
        }
        int i14 = format.f19923f;
        if (i14 != -1 && i14 > i11) {
            return false;
        }
        if (!z12 && ((i13 = format.f19940w) == -1 || i13 != bVar.f20788a)) {
            return false;
        }
        if (z10 || ((str = format.f19927j) != null && TextUtils.equals(str, bVar.f20790c))) {
            return z11 || ((i12 = format.f19941x) != -1 && i12 == bVar.f20789b);
        }
        return false;
    }

    public static boolean z(Format format, @Nullable String str, int i10, int i11, int i12, int i13, int i14, int i15) {
        if ((format.f19922e & 16384) != 0 || !x(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !k0.c(format.f19927j, str)) {
            return false;
        }
        int i16 = format.f19932o;
        if (i16 != -1 && i16 > i12) {
            return false;
        }
        int i17 = format.f19933p;
        if (i17 != -1 && i17 > i13) {
            return false;
        }
        float f10 = format.f19934q;
        if (f10 != -1.0f && f10 > i14) {
            return false;
        }
        int i18 = format.f19923f;
        return i18 == -1 || i18 <= i15;
    }

    public c.a[] E(b.a aVar, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        boolean z10;
        String str;
        int i10;
        c cVar;
        String str2;
        int i11;
        int iC = aVar.c();
        c.a[] aVarArr = new c.a[iC];
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        while (true) {
            if (i13 >= iC) {
                break;
            }
            if (2 == aVar.d(i13)) {
                if (!z11) {
                    c.a aVarJ = J(aVar.e(i13), iArr[i13], iArr2[i13], parameters, true);
                    aVarArr[i13] = aVarJ;
                    z11 = aVarJ != null;
                }
                z12 |= aVar.e(i13).f20392b > 0;
            }
            i13++;
        }
        int i14 = 0;
        int i15 = -1;
        c cVar2 = null;
        String str3 = null;
        while (i14 < iC) {
            if (z10 == aVar.d(i14)) {
                boolean z13 = (this.f20764f || !z12) ? z10 : false;
                i10 = i15;
                cVar = cVar2;
                str2 = str3;
                i11 = i14;
                Pair<c.a, c> pairF = F(aVar.e(i14), iArr[i14], iArr2[i14], parameters, z13);
                if (pairF != null && (cVar == null || ((c) pairF.second).compareTo(cVar) > 0)) {
                    if (i10 != -1) {
                        aVarArr[i10] = null;
                    }
                    c.a aVar2 = (c.a) pairF.first;
                    aVarArr[i11] = aVar2;
                    str3 = aVar2.f20874a.b(aVar2.f20875b[0]).B;
                    cVar2 = (c) pairF.second;
                    i15 = i11;
                }
                i14 = i11 + 1;
                z10 = true;
            } else {
                i10 = i15;
                cVar = cVar2;
                str2 = str3;
                i11 = i14;
            }
            i15 = i10;
            cVar2 = cVar;
            str3 = str2;
            i14 = i11 + 1;
            z10 = true;
        }
        String str4 = str3;
        int i16 = -1;
        e eVar = null;
        while (i12 < iC) {
            int iD = aVar.d(i12);
            if (iD == 1) {
                str = str4;
            } else if (iD == 2) {
                str = str4;
            } else if (iD != 3) {
                aVarArr[i12] = H(iD, aVar.e(i12), iArr[i12], parameters);
                str = str4;
            } else {
                str = str4;
                Pair<c.a, e> pairI = I(aVar.e(i12), iArr[i12], parameters, str);
                if (pairI != null && (eVar == null || ((e) pairI.second).compareTo(eVar) > 0)) {
                    if (i16 != -1) {
                        aVarArr[i16] = null;
                    }
                    aVarArr[i12] = (c.a) pairI.first;
                    eVar = (e) pairI.second;
                    i16 = i12;
                }
            }
            i12++;
            str4 = str;
        }
        return aVarArr;
    }

    @Nullable
    public Pair<c.a, c> F(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, boolean z10) throws ExoPlaybackException {
        c.a aVar = null;
        c cVar = null;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < trackGroupArray.f20392b; i13++) {
            TrackGroup trackGroupB = trackGroupArray.b(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < trackGroupB.f20388b; i14++) {
                if (x(iArr2[i14], parameters.C)) {
                    c cVar2 = new c(trackGroupB.b(i14), parameters, iArr2[i14]);
                    if ((cVar2.f20791b || parameters.f20777u) && (cVar == null || cVar2.compareTo(cVar) > 0)) {
                        i11 = i13;
                        i12 = i14;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        TrackGroup trackGroupB2 = trackGroupArray.b(i11);
        if (!parameters.f20782z && !parameters.f20781y && z10) {
            int[] iArrQ = q(trackGroupB2, iArr[i11], parameters.f20776t, parameters.f20778v, parameters.f20779w, parameters.f20780x);
            if (iArrQ.length > 0) {
                aVar = new c.a(trackGroupB2, iArrQ);
            }
        }
        if (aVar == null) {
            aVar = new c.a(trackGroupB2, i12);
        }
        return Pair.create(aVar, (c) a6.a.e(cVar));
    }

    @Nullable
    public c.a H(int i10, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        TrackGroup trackGroup = null;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < trackGroupArray.f20392b; i13++) {
            TrackGroup trackGroupB = trackGroupArray.b(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < trackGroupB.f20388b; i14++) {
                if (x(iArr2[i14], parameters.C)) {
                    int i15 = (trackGroupB.b(i14).f19921d & 1) != 0 ? 2 : 1;
                    if (x(iArr2[i14], false)) {
                        i15 += 1000;
                    }
                    if (i15 > i12) {
                        trackGroup = trackGroupB;
                        i11 = i14;
                        i12 = i15;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new c.a(trackGroup, i11);
    }

    @Nullable
    public Pair<c.a, e> I(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters, @Nullable String str) throws ExoPlaybackException {
        int i10 = -1;
        TrackGroup trackGroup = null;
        e eVar = null;
        for (int i11 = 0; i11 < trackGroupArray.f20392b; i11++) {
            TrackGroup trackGroupB = trackGroupArray.b(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < trackGroupB.f20388b; i12++) {
                if (x(iArr2[i12], parameters.C)) {
                    e eVar2 = new e(trackGroupB.b(i12), parameters, iArr2[i12], str);
                    if (eVar2.f20823b && (eVar == null || eVar2.compareTo(eVar) > 0)) {
                        trackGroup = trackGroupB;
                        i10 = i12;
                        eVar = eVar2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return Pair.create(new c.a(trackGroup, i10), (e) a6.a.e(eVar));
    }

    @Nullable
    public c.a J(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, boolean z10) throws ExoPlaybackException {
        c.a aVarD = (parameters.f20782z || parameters.f20781y || !z10) ? null : D(trackGroupArray, iArr, i10, parameters);
        return aVarD == null ? G(trackGroupArray, iArr, parameters) : aVarD;
    }

    public void K(Parameters parameters) {
        a6.a.e(parameters);
        if (this.f20763e.getAndSet(parameters).equals(parameters)) {
            return;
        }
        c();
    }

    public void L(d dVar) {
        K(dVar.a());
    }

    @Override // com.google.android.exoplayer.trackselection.b
    public final Pair<r0[], com.google.android.exoplayer.trackselection.c[]> j(b.a aVar, int[][][] iArr, int[] iArr2) throws ExoPlaybackException {
        Parameters parameters = this.f20763e.get();
        int iC = aVar.c();
        c.a[] aVarArrE = E(aVar, iArr, iArr2, parameters);
        int i10 = 0;
        while (true) {
            if (i10 >= iC) {
                break;
            }
            if (parameters.i(i10)) {
                aVarArrE[i10] = null;
            } else {
                TrackGroupArray trackGroupArrayE = aVar.e(i10);
                if (parameters.k(i10, trackGroupArrayE)) {
                    SelectionOverride selectionOverrideJ = parameters.j(i10, trackGroupArrayE);
                    aVarArrE[i10] = selectionOverrideJ != null ? new c.a(trackGroupArrayE.b(selectionOverrideJ.f20783b), selectionOverrideJ.f20784c, selectionOverrideJ.f20786e, Integer.valueOf(selectionOverrideJ.f20787f)) : null;
                }
            }
            i10++;
        }
        com.google.android.exoplayer.trackselection.c[] cVarArrA = this.f20762d.a(aVarArrE, a());
        r0[] r0VarArr = new r0[iC];
        for (int i11 = 0; i11 < iC; i11++) {
            r0VarArr[i11] = !parameters.i(i11) && (aVar.d(i11) == 6 || cVarArrA[i11] != null) ? r0.f60215b : null;
        }
        A(aVar, iArr, r0VarArr, cVarArrA, parameters.D);
        return Pair.create(r0VarArr, cVarArrA);
    }

    public Parameters v() {
        return this.f20763e.get();
    }
}
