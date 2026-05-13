package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.ui.l0;
import com.google.android.exoplayer2.v;
import com.google.common.collect.ImmutableList;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import d6.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class StyledPlayerControlView extends FrameLayout {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final float[] f22589z0;

    @Nullable
    public final View A;

    @Nullable
    public final View B;

    @Nullable
    public final View C;

    @Nullable
    public final TextView D;

    @Nullable
    public final TextView E;

    @Nullable
    public final l0 F;
    public final StringBuilder G;
    public final Formatter H;
    public final c0.b I;
    public final c0.d J;
    public final Runnable K;
    public final Drawable L;
    public final Drawable M;
    public final Drawable N;
    public final String O;
    public final String P;
    public final String Q;
    public final Drawable R;
    public final Drawable S;
    public final float T;
    public final float U;
    public final String V;
    public final String W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Drawable f22590a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f22591b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Drawable f22592b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Resources f22593c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final String f22594c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f22595d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final String f22596d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList<m> f22597e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Drawable f22598e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView f22599f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Drawable f22600f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f22601g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final String f22602g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f22603h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final String f22604h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f22605i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.v f22606i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f22607j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @Nullable
    public f f22608j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m0 f22609k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @Nullable
    public d f22610k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow f22611l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f22612l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f22613m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f22614m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final View f22615n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f22616n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final View f22617o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f22618o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final View f22619p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f22620p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final View f22621q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f22622q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final View f22623r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f22624r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final TextView f22625s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f22626s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final TextView f22627t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long[] f22628t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final ImageView f22629u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean[] f22630u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final ImageView f22631v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long[] f22632v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public final View f22633w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean[] f22634w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final ImageView f22635x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public long f22636x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public final ImageView f22637y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f22638y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final ImageView f22639z;

    public final class b extends l {
        public b() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view) {
            if (StyledPlayerControlView.this.f22606i0 == null) {
                return;
            }
            ((com.google.android.exoplayer2.v) s7.m0.j(StyledPlayerControlView.this.f22606i0)).d(StyledPlayerControlView.this.f22606i0.getTrackSelectionParameters().a().B(1).J(1, false).A());
            StyledPlayerControlView.this.f22601g.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(R$string.exo_track_selection_auto));
            StyledPlayerControlView.this.f22611l.dismiss();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void f(i iVar) {
            iVar.f22654l.setText(R$string.exo_track_selection_auto);
            iVar.f22655m.setVisibility(i(((com.google.android.exoplayer2.v) s7.a.e(StyledPlayerControlView.this.f22606i0)).getTrackSelectionParameters()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22824b.lambda$onBindViewHolderAtZeroPosition$0(view);
                }
            });
        }

        public final boolean i(q7.y yVar) {
            for (int i10 = 0; i10 < this.f22660i.size(); i10++) {
                if (yVar.f78152z.containsKey(this.f22660i.get(i10).f22657a.b())) {
                    return true;
                }
            }
            return false;
        }

        public void init(List<k> list) {
            this.f22660i = list;
            q7.y trackSelectionParameters = ((com.google.android.exoplayer2.v) s7.a.e(StyledPlayerControlView.this.f22606i0)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                StyledPlayerControlView.this.f22601g.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(R$string.exo_track_selection_none));
                return;
            }
            if (!i(trackSelectionParameters)) {
                StyledPlayerControlView.this.f22601g.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(R$string.exo_track_selection_auto));
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                k kVar = list.get(i10);
                if (kVar.a()) {
                    StyledPlayerControlView.this.f22601g.setSubTextAtPosition(1, kVar.f22659c);
                    return;
                }
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void onTrackSelection(String str) {
            StyledPlayerControlView.this.f22601g.setSubTextAtPosition(1, str);
        }
    }

    public final class c implements v.d, l0.a, View.OnClickListener, PopupWindow.OnDismissListener {
        public c() {
        }

        @Override // com.google.android.exoplayer2.v.d
        public void G(com.google.android.exoplayer2.v vVar, v.c cVar) {
            if (cVar.b(4, 5)) {
                StyledPlayerControlView.this.y0();
            }
            if (cVar.b(4, 5, 7)) {
                StyledPlayerControlView.this.A0();
            }
            if (cVar.a(8)) {
                StyledPlayerControlView.this.B0();
            }
            if (cVar.a(9)) {
                StyledPlayerControlView.this.E0();
            }
            if (cVar.b(8, 9, 11, 0, 16, 17, 13)) {
                StyledPlayerControlView.this.x0();
            }
            if (cVar.b(11, 0)) {
                StyledPlayerControlView.this.F0();
            }
            if (cVar.a(12)) {
                StyledPlayerControlView.this.z0();
            }
            if (cVar.a(2)) {
                StyledPlayerControlView.this.G0();
            }
        }

        @Override // com.google.android.exoplayer2.ui.l0.a
        public void o(l0 l0Var, long j10, boolean z10) {
            StyledPlayerControlView.this.f22620p0 = false;
            if (!z10 && StyledPlayerControlView.this.f22606i0 != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.p0(styledPlayerControlView.f22606i0, j10);
            }
            StyledPlayerControlView.this.f22591b.W();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.google.android.exoplayer2.v vVar = StyledPlayerControlView.this.f22606i0;
            if (vVar == null) {
                return;
            }
            StyledPlayerControlView.this.f22591b.W();
            if (StyledPlayerControlView.this.f22617o == view) {
                vVar.seekToNext();
                return;
            }
            if (StyledPlayerControlView.this.f22615n == view) {
                vVar.seekToPrevious();
                return;
            }
            if (StyledPlayerControlView.this.f22621q == view) {
                if (vVar.getPlaybackState() != 4) {
                    vVar.seekForward();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.f22623r == view) {
                vVar.seekBack();
                return;
            }
            if (StyledPlayerControlView.this.f22619p == view) {
                StyledPlayerControlView.this.X(vVar);
                return;
            }
            if (StyledPlayerControlView.this.f22629u == view) {
                vVar.setRepeatMode(s7.d0.a(vVar.getRepeatMode(), StyledPlayerControlView.this.f22626s0));
                return;
            }
            if (StyledPlayerControlView.this.f22631v == view) {
                vVar.setShuffleModeEnabled(!vVar.getShuffleModeEnabled());
                return;
            }
            if (StyledPlayerControlView.this.A == view) {
                StyledPlayerControlView.this.f22591b.V();
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.Y(styledPlayerControlView.f22601g, StyledPlayerControlView.this.A);
                return;
            }
            if (StyledPlayerControlView.this.B == view) {
                StyledPlayerControlView.this.f22591b.V();
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                styledPlayerControlView2.Y(styledPlayerControlView2.f22603h, StyledPlayerControlView.this.B);
            } else if (StyledPlayerControlView.this.C == view) {
                StyledPlayerControlView.this.f22591b.V();
                StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                styledPlayerControlView3.Y(styledPlayerControlView3.f22607j, StyledPlayerControlView.this.C);
            } else if (StyledPlayerControlView.this.f22635x == view) {
                StyledPlayerControlView.this.f22591b.V();
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                styledPlayerControlView4.Y(styledPlayerControlView4.f22605i, StyledPlayerControlView.this.f22635x);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (StyledPlayerControlView.this.f22638y0) {
                StyledPlayerControlView.this.f22591b.W();
            }
        }

        @Override // com.google.android.exoplayer2.ui.l0.a
        public void r(l0 l0Var, long j10) {
            if (StyledPlayerControlView.this.E != null) {
                StyledPlayerControlView.this.E.setText(s7.m0.b0(StyledPlayerControlView.this.G, StyledPlayerControlView.this.H, j10));
            }
        }

        @Override // com.google.android.exoplayer2.ui.l0.a
        public void t(l0 l0Var, long j10) {
            StyledPlayerControlView.this.f22620p0 = true;
            if (StyledPlayerControlView.this.E != null) {
                StyledPlayerControlView.this.E.setText(s7.m0.b0(StyledPlayerControlView.this.G, StyledPlayerControlView.this.H, j10));
            }
            StyledPlayerControlView.this.f22591b.V();
        }
    }

    @Deprecated
    public interface d {
        void onFullScreenModeChanged(boolean z10);
    }

    public final class e extends RecyclerView.Adapter<i> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String[] f22642i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float[] f22643j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f22644k;

        public e(String[] strArr, float[] fArr) {
            this.f22642i = strArr;
            this.f22643j = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(int i10, View view) {
            if (i10 != this.f22644k) {
                StyledPlayerControlView.this.setPlaybackSpeed(this.f22643j[i10]);
            }
            StyledPlayerControlView.this.f22611l.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, final int i10) {
            String[] strArr = this.f22642i;
            if (i10 < strArr.length) {
                iVar.f22654l.setText(strArr[i10]);
            }
            if (i10 == this.f22644k) {
                iVar.itemView.setSelected(true);
                iVar.f22655m.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f22655m.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22825b.lambda$onBindViewHolder$0(i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R$layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f22642i.length;
        }

        public String getSelectedText() {
            return this.f22642i[this.f22644k];
        }

        public void updateSelectedIndex(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f22643j;
                if (i10 >= fArr.length) {
                    this.f22644k = i11;
                    return;
                }
                float fAbs = Math.abs(f10 - fArr[i10]);
                if (fAbs < f11) {
                    i11 = i10;
                    f11 = fAbs;
                }
                i10++;
            }
        }
    }

    public interface f {
        void onProgressUpdate(long j10, long j11);
    }

    public final class g extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final TextView f22646l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final TextView f22647m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ImageView f22648n;

        public g(View view) {
            super(view);
            if (s7.m0.f79487a < 26) {
                view.setFocusable(true);
            }
            this.f22646l = (TextView) view.findViewById(R$id.exo_main_text);
            this.f22647m = (TextView) view.findViewById(R$id.exo_sub_text);
            this.f22648n = (ImageView) view.findViewById(R$id.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f22827b.lambda$new$0(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(View view) {
            StyledPlayerControlView.this.l0(getAdapterPosition());
        }
    }

    public class h extends RecyclerView.Adapter<g> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String[] f22650i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String[] f22651j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Drawable[] f22652k;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f22650i = strArr;
            this.f22651j = new String[strArr.length];
            this.f22652k = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g gVar, int i10) {
            gVar.f22646l.setText(this.f22650i[i10]);
            if (this.f22651j[i10] == null) {
                gVar.f22647m.setVisibility(8);
            } else {
                gVar.f22647m.setText(this.f22651j[i10]);
            }
            if (this.f22652k[i10] == null) {
                gVar.f22648n.setVisibility(8);
            } else {
                gVar.f22648n.setImageDrawable(this.f22652k[i10]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return StyledPlayerControlView.this.new g(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R$layout.exo_styled_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f22650i.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        public void setSubTextAtPosition(int i10, String str) {
            this.f22651j[i10] = str;
        }
    }

    public static class i extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final TextView f22654l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final View f22655m;

        public i(View view) {
            super(view);
            if (s7.m0.f79487a < 26) {
                view.setFocusable(true);
            }
            this.f22654l = (TextView) view.findViewById(R$id.exo_text);
            this.f22655m = view.findViewById(R$id.exo_check);
        }
    }

    public final class j extends l {
        public j() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(View view) {
            if (StyledPlayerControlView.this.f22606i0 != null) {
                StyledPlayerControlView.this.f22606i0.d(StyledPlayerControlView.this.f22606i0.getTrackSelectionParameters().a().B(3).F(-3).A());
                StyledPlayerControlView.this.f22611l.dismiss();
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, int i10) {
            super.onBindViewHolder(iVar, i10);
            if (i10 > 0) {
                iVar.f22655m.setVisibility(this.f22660i.get(i10 + (-1)).a() ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void f(i iVar) {
            boolean z10;
            iVar.f22654l.setText(R$string.exo_track_selection_none);
            int i10 = 0;
            while (true) {
                if (i10 >= this.f22660i.size()) {
                    z10 = true;
                    break;
                } else {
                    if (this.f22660i.get(i10).a()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            iVar.f22655m.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22828b.lambda$onBindViewHolderAtZeroPosition$0(view);
                }
            });
        }

        public void init(List<k> list) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (list.get(i10).a()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (StyledPlayerControlView.this.f22635x != null) {
                ImageView imageView = StyledPlayerControlView.this.f22635x;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                imageView.setImageDrawable(z10 ? styledPlayerControlView.f22590a0 : styledPlayerControlView.f22592b0);
                StyledPlayerControlView.this.f22635x.setContentDescription(z10 ? StyledPlayerControlView.this.f22594c0 : StyledPlayerControlView.this.f22596d0);
            }
            this.f22660i = list;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.l
        public void onTrackSelection(String str) {
        }
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0.a f22657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f22659c;

        public k(com.google.android.exoplayer2.d0 d0Var, int i10, int i11, String str) {
            this.f22657a = d0Var.b().get(i10);
            this.f22658b = i11;
            this.f22659c = str;
        }

        public boolean a() {
            return this.f22657a.f(this.f22658b);
        }
    }

    public abstract class l extends RecyclerView.Adapter<i> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<k> f22660i = new ArrayList();

        public l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(com.google.android.exoplayer2.v vVar, e7.g0 g0Var, k kVar, View view) {
            vVar.d(vVar.getTrackSelectionParameters().a().G(new q7.w(g0Var, ImmutableList.of(Integer.valueOf(kVar.f22658b)))).J(kVar.f22657a.getType(), false).A());
            onTrackSelection(kVar.f22659c);
            StyledPlayerControlView.this.f22611l.dismiss();
        }

        public void clear() {
            this.f22660i = Collections.emptyList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e */
        public void onBindViewHolder(i iVar, int i10) {
            final com.google.android.exoplayer2.v vVar = StyledPlayerControlView.this.f22606i0;
            if (vVar == null) {
                return;
            }
            if (i10 == 0) {
                f(iVar);
                return;
            }
            final k kVar = this.f22660i.get(i10 - 1);
            final e7.g0 g0VarB = kVar.f22657a.b();
            boolean z10 = vVar.getTrackSelectionParameters().f78152z.get(g0VarB) != null && kVar.a();
            iVar.f22654l.setText(kVar.f22659c);
            iVar.f22655m.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22829b.d(vVar, g0VarB, kVar, view);
                }
            });
        }

        public abstract void f(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R$layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.f22660i.isEmpty()) {
                return 0;
            }
            return this.f22660i.size() + 1;
        }

        public abstract void onTrackSelection(String str);
    }

    @Deprecated
    public interface m {
        void onVisibilityChange(int i10);
    }

    static {
        x0.a("goog.exo.ui");
        f22589z0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.ViewGroup, com.google.android.exoplayer2.ui.StyledPlayerControlView$a] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i10, @Nullable AttributeSet attributeSet2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        c cVar;
        boolean z18;
        boolean z19;
        ?? r92;
        boolean z20;
        super(context, attributeSet, i10);
        int resourceId = R$layout.exo_styled_player_control_view;
        this.f22622q0 = 5000;
        this.f22626s0 = 0;
        this.f22624r0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R$styleable.StyledPlayerControlView, i10, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.StyledPlayerControlView_controller_layout_id, resourceId);
                this.f22622q0 = typedArrayObtainStyledAttributes.getInt(R$styleable.StyledPlayerControlView_show_timeout, this.f22622q0);
                this.f22626s0 = a0(typedArrayObtainStyledAttributes, this.f22626s0);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerControlView_show_rewind_button, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerControlView_show_fastforward_button, true);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerControlView_show_previous_button, true);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerControlView_show_next_button, true);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerControlView_show_shuffle_button, false);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerControlView_show_subtitle_button, false);
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R$styleable.StyledPlayerControlView_time_bar_min_update_interval, this.f22624r0));
                boolean z28 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.StyledPlayerControlView_animation_enabled, true);
                typedArrayObtainStyledAttributes.recycle();
                z11 = z25;
                z12 = z26;
                z14 = z21;
                z15 = z22;
                z16 = z23;
                z13 = z28;
                z17 = z24;
                z10 = z27;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = true;
            z14 = true;
            z15 = true;
            z16 = true;
            z17 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        c cVar2 = new c();
        this.f22595d = cVar2;
        this.f22597e = new CopyOnWriteArrayList<>();
        this.I = new c0.b();
        this.J = new c0.d();
        StringBuilder sb2 = new StringBuilder();
        this.G = sb2;
        this.H = new Formatter(sb2, Locale.getDefault());
        this.f22628t0 = new long[0];
        this.f22630u0 = new boolean[0];
        this.f22632v0 = new long[0];
        this.f22634w0 = new boolean[0];
        this.K = new Runnable() { // from class: com.google.android.exoplayer2.ui.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f22821b.A0();
            }
        };
        this.D = (TextView) findViewById(R$id.exo_duration);
        this.E = (TextView) findViewById(R$id.exo_position);
        ImageView imageView = (ImageView) findViewById(R$id.exo_subtitle);
        this.f22635x = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar2);
        }
        ImageView imageView2 = (ImageView) findViewById(R$id.exo_fullscreen);
        this.f22637y = imageView2;
        e0(imageView2, new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22822b.j0(view);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R$id.exo_minimal_fullscreen);
        this.f22639z = imageView3;
        e0(imageView3, new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22822b.j0(view);
            }
        });
        View viewFindViewById = findViewById(R$id.exo_settings);
        this.A = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar2);
        }
        View viewFindViewById2 = findViewById(R$id.exo_playback_speed);
        this.B = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar2);
        }
        View viewFindViewById3 = findViewById(R$id.exo_audio_track);
        this.C = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar2);
        }
        int i11 = R$id.exo_progress;
        l0 l0Var = (l0) findViewById(i11);
        View viewFindViewById4 = findViewById(R$id.exo_progress_placeholder);
        if (l0Var != null) {
            this.F = l0Var;
            cVar = cVar2;
            z18 = z13;
            z19 = z10;
            r92 = 0;
        } else if (viewFindViewById4 != null) {
            r92 = 0;
            cVar = cVar2;
            z18 = z13;
            z19 = z10;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, R$style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i11);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.F = defaultTimeBar;
        } else {
            cVar = cVar2;
            z18 = z13;
            z19 = z10;
            r92 = 0;
            this.F = null;
        }
        l0 l0Var2 = this.F;
        c cVar3 = cVar;
        if (l0Var2 != null) {
            l0Var2.a(cVar3);
        }
        View viewFindViewById5 = findViewById(R$id.exo_play_pause);
        this.f22619p = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar3);
        }
        View viewFindViewById6 = findViewById(R$id.exo_prev);
        this.f22615n = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar3);
        }
        View viewFindViewById7 = findViewById(R$id.exo_next);
        this.f22617o = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar3);
        }
        Typeface font = ResourcesCompat.getFont(context, R$font.roboto_medium_numbers);
        ?? FindViewById = findViewById(R$id.exo_rew);
        ?? r62 = FindViewById == 0 ? (TextView) findViewById(R$id.exo_rew_with_amount) : r92;
        this.f22627t = r62;
        if (r62 != 0) {
            r62.setTypeface(font);
        }
        FindViewById = FindViewById == 0 ? r62 : FindViewById;
        this.f22623r = FindViewById;
        if (FindViewById != 0) {
            FindViewById.setOnClickListener(cVar3);
        }
        ?? FindViewById2 = findViewById(R$id.exo_ffwd);
        ?? r63 = FindViewById2 == 0 ? (TextView) findViewById(R$id.exo_ffwd_with_amount) : r92;
        this.f22625s = r63;
        if (r63 != 0) {
            r63.setTypeface(font);
        }
        FindViewById2 = FindViewById2 == 0 ? r63 : FindViewById2;
        this.f22621q = FindViewById2;
        if (FindViewById2 != 0) {
            FindViewById2.setOnClickListener(cVar3);
        }
        ImageView imageView4 = (ImageView) findViewById(R$id.exo_repeat_toggle);
        this.f22629u = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar3);
        }
        ImageView imageView5 = (ImageView) findViewById(R$id.exo_shuffle);
        this.f22631v = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar3);
        }
        Resources resources = context.getResources();
        this.f22593c = resources;
        this.T = resources.getInteger(R$integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.U = resources.getInteger(R$integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById8 = findViewById(R$id.exo_vr);
        this.f22633w = viewFindViewById8;
        if (viewFindViewById8 != null) {
            t0(false, viewFindViewById8);
        }
        g0 g0Var = new g0(this);
        this.f22591b = g0Var;
        g0Var.X(z18);
        h hVar = new h(new String[]{resources.getString(R$string.exo_controls_playback_speed), resources.getString(R$string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R$drawable.exo_styled_controls_speed), resources.getDrawable(R$drawable.exo_styled_controls_audiotrack)});
        this.f22601g = hVar;
        this.f22613m = resources.getDimensionPixelSize(R$dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R$layout.exo_styled_settings_list, r92);
        this.f22599f = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f22611l = popupWindow;
        if (s7.m0.f79487a < 23) {
            z20 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z20 = false;
        }
        popupWindow.setOnDismissListener(cVar3);
        this.f22638y0 = true;
        this.f22609k = new com.google.android.exoplayer2.ui.e(getResources());
        this.f22590a0 = resources.getDrawable(R$drawable.exo_styled_controls_subtitle_on);
        this.f22592b0 = resources.getDrawable(R$drawable.exo_styled_controls_subtitle_off);
        this.f22594c0 = resources.getString(R$string.exo_controls_cc_enabled_description);
        this.f22596d0 = resources.getString(R$string.exo_controls_cc_disabled_description);
        this.f22605i = new j();
        this.f22607j = new b();
        this.f22603h = new e(resources.getStringArray(R$array.exo_controls_playback_speeds), f22589z0);
        this.f22598e0 = resources.getDrawable(R$drawable.exo_styled_controls_fullscreen_exit);
        this.f22600f0 = resources.getDrawable(R$drawable.exo_styled_controls_fullscreen_enter);
        this.L = resources.getDrawable(R$drawable.exo_styled_controls_repeat_off);
        this.M = resources.getDrawable(R$drawable.exo_styled_controls_repeat_one);
        this.N = resources.getDrawable(R$drawable.exo_styled_controls_repeat_all);
        this.R = resources.getDrawable(R$drawable.exo_styled_controls_shuffle_on);
        this.S = resources.getDrawable(R$drawable.exo_styled_controls_shuffle_off);
        this.f22602g0 = resources.getString(R$string.exo_controls_fullscreen_exit_description);
        this.f22604h0 = resources.getString(R$string.exo_controls_fullscreen_enter_description);
        this.O = this.f22593c.getString(R$string.exo_controls_repeat_off_description);
        this.P = this.f22593c.getString(R$string.exo_controls_repeat_one_description);
        this.Q = this.f22593c.getString(R$string.exo_controls_repeat_all_description);
        this.V = this.f22593c.getString(R$string.exo_controls_shuffle_on_description);
        this.W = this.f22593c.getString(R$string.exo_controls_shuffle_off_description);
        this.f22591b.Y((ViewGroup) findViewById(R$id.exo_bottom_bar), true);
        this.f22591b.Y(this.f22621q, z15);
        this.f22591b.Y(this.f22623r, z14);
        this.f22591b.Y(this.f22615n, z16);
        this.f22591b.Y(this.f22617o, z17);
        this.f22591b.Y(this.f22631v, z11);
        this.f22591b.Y(this.f22635x, z12);
        this.f22591b.Y(this.f22633w, z19);
        this.f22591b.Y(this.f22629u, this.f22626s0 != 0 ? true : z20);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.n
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                this.f22823b.k0(view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
    }

    public static boolean T(com.google.android.exoplayer2.c0 c0Var, c0.d dVar) {
        if (c0Var.t() > 100) {
            return false;
        }
        int iT = c0Var.t();
        for (int i10 = 0; i10 < iT; i10++) {
            if (c0Var.r(i10, dVar).f21415o == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public static int a0(TypedArray typedArray, int i10) {
        return typedArray.getInt(R$styleable.StyledPlayerControlView_repeat_toggle_modes, i10);
    }

    public static void e0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    public static boolean g0(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        com.google.android.exoplayer2.v vVar = this.f22606i0;
        if (vVar == null) {
            return;
        }
        vVar.b(vVar.getPlaybackParameters().e(f10));
    }

    public static void w0(@Nullable View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public final void A0() {
        long contentBufferedPosition;
        if (h0() && this.f22614m0) {
            com.google.android.exoplayer2.v vVar = this.f22606i0;
            long contentPosition = 0;
            if (vVar != null) {
                contentPosition = this.f22636x0 + vVar.getContentPosition();
                contentBufferedPosition = this.f22636x0 + vVar.getContentBufferedPosition();
            } else {
                contentBufferedPosition = 0;
            }
            TextView textView = this.E;
            if (textView != null && !this.f22620p0) {
                textView.setText(s7.m0.b0(this.G, this.H, contentPosition));
            }
            l0 l0Var = this.F;
            if (l0Var != null) {
                l0Var.setPosition(contentPosition);
                this.F.setBufferedPosition(contentBufferedPosition);
            }
            f fVar = this.f22608j0;
            if (fVar != null) {
                fVar.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.K);
            int playbackState = vVar == null ? 1 : vVar.getPlaybackState();
            if (vVar == null || !vVar.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.K, 1000L);
                return;
            }
            l0 l0Var2 = this.F;
            long jMin = Math.min(l0Var2 != null ? l0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f10 = vVar.getPlaybackParameters().f22486b;
            postDelayed(this.K, s7.m0.q(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f22624r0, 1000L));
        }
    }

    public final void B0() {
        ImageView imageView;
        if (h0() && this.f22614m0 && (imageView = this.f22629u) != null) {
            if (this.f22626s0 == 0) {
                t0(false, imageView);
                return;
            }
            com.google.android.exoplayer2.v vVar = this.f22606i0;
            if (vVar == null) {
                t0(false, imageView);
                this.f22629u.setImageDrawable(this.L);
                this.f22629u.setContentDescription(this.O);
                return;
            }
            t0(true, imageView);
            int repeatMode = vVar.getRepeatMode();
            if (repeatMode == 0) {
                this.f22629u.setImageDrawable(this.L);
                this.f22629u.setContentDescription(this.O);
            } else if (repeatMode == 1) {
                this.f22629u.setImageDrawable(this.M);
                this.f22629u.setContentDescription(this.P);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.f22629u.setImageDrawable(this.N);
                this.f22629u.setContentDescription(this.Q);
            }
        }
    }

    public final void C0() {
        com.google.android.exoplayer2.v vVar = this.f22606i0;
        int seekBackIncrement = (int) ((vVar != null ? vVar.getSeekBackIncrement() : 5000L) / 1000);
        TextView textView = this.f22627t;
        if (textView != null) {
            textView.setText(String.valueOf(seekBackIncrement));
        }
        View view = this.f22623r;
        if (view != null) {
            view.setContentDescription(this.f22593c.getQuantityString(R$plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
        }
    }

    public final void D0() {
        this.f22599f.measure(0, 0);
        this.f22611l.setWidth(Math.min(this.f22599f.getMeasuredWidth(), getWidth() - (this.f22613m * 2)));
        this.f22611l.setHeight(Math.min(getHeight() - (this.f22613m * 2), this.f22599f.getMeasuredHeight()));
    }

    public final void E0() {
        ImageView imageView;
        if (h0() && this.f22614m0 && (imageView = this.f22631v) != null) {
            com.google.android.exoplayer2.v vVar = this.f22606i0;
            if (!this.f22591b.A(imageView)) {
                t0(false, this.f22631v);
                return;
            }
            if (vVar == null) {
                t0(false, this.f22631v);
                this.f22631v.setImageDrawable(this.S);
                this.f22631v.setContentDescription(this.W);
            } else {
                t0(true, this.f22631v);
                this.f22631v.setImageDrawable(vVar.getShuffleModeEnabled() ? this.R : this.S);
                this.f22631v.setContentDescription(vVar.getShuffleModeEnabled() ? this.V : this.W);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F0() {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerControlView.F0():void");
    }

    public final void G0() {
        d0();
        t0(this.f22605i.getItemCount() > 0, this.f22635x);
    }

    @Deprecated
    public void S(m mVar) {
        s7.a.e(mVar);
        this.f22597e.add(mVar);
    }

    public boolean U(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        com.google.android.exoplayer2.v vVar = this.f22606i0;
        if (vVar == null || !g0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (vVar.getPlaybackState() == 4) {
                return true;
            }
            vVar.seekForward();
            return true;
        }
        if (keyCode == 89) {
            vVar.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            X(vVar);
            return true;
        }
        if (keyCode == 87) {
            vVar.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            vVar.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            W(vVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        V(vVar);
        return true;
    }

    public final void V(com.google.android.exoplayer2.v vVar) {
        vVar.pause();
    }

    public final void W(com.google.android.exoplayer2.v vVar) {
        int playbackState = vVar.getPlaybackState();
        if (playbackState == 1) {
            vVar.prepare();
        } else if (playbackState == 4) {
            o0(vVar, vVar.getCurrentMediaItemIndex(), -9223372036854775807L);
        }
        vVar.play();
    }

    public final void X(com.google.android.exoplayer2.v vVar) {
        int playbackState = vVar.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !vVar.getPlayWhenReady()) {
            W(vVar);
        } else {
            V(vVar);
        }
    }

    public final void Y(RecyclerView.Adapter<?> adapter, View view) {
        this.f22599f.setAdapter(adapter);
        D0();
        this.f22638y0 = false;
        this.f22611l.dismiss();
        this.f22638y0 = true;
        this.f22611l.showAsDropDown(view, (getWidth() - this.f22611l.getWidth()) - this.f22613m, (-this.f22611l.getHeight()) - this.f22613m);
    }

    public final ImmutableList<k> Z(com.google.android.exoplayer2.d0 d0Var, int i10) {
        ImmutableList.a aVar = new ImmutableList.a();
        ImmutableList<d0.a> immutableListB = d0Var.b();
        for (int i11 = 0; i11 < immutableListB.size(); i11++) {
            d0.a aVar2 = immutableListB.get(i11);
            if (aVar2.getType() == i10) {
                for (int i12 = 0; i12 < aVar2.f21424b; i12++) {
                    if (aVar2.g(i12)) {
                        com.google.android.exoplayer2.m mVarC = aVar2.c(i12);
                        if ((mVarC.f21743e & 2) == 0) {
                            aVar.a(new k(d0Var, i11, i12, this.f22609k.a(mVarC)));
                        }
                    }
                }
            }
        }
        return aVar.m();
    }

    public void b0() {
        this.f22591b.C();
    }

    public void c0() {
        this.f22591b.F();
    }

    public final void d0() {
        this.f22605i.clear();
        this.f22607j.clear();
        com.google.android.exoplayer2.v vVar = this.f22606i0;
        if (vVar != null && vVar.isCommandAvailable(30) && this.f22606i0.isCommandAvailable(29)) {
            com.google.android.exoplayer2.d0 currentTracks = this.f22606i0.getCurrentTracks();
            this.f22607j.init(Z(currentTracks, 1));
            if (this.f22591b.A(this.f22635x)) {
                this.f22605i.init(Z(currentTracks, 3));
            } else {
                this.f22605i.init(ImmutableList.of());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return U(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean f0() {
        return this.f22591b.I();
    }

    @Nullable
    public com.google.android.exoplayer2.v getPlayer() {
        return this.f22606i0;
    }

    public int getRepeatToggleModes() {
        return this.f22626s0;
    }

    public boolean getShowShuffleButton() {
        return this.f22591b.A(this.f22631v);
    }

    public boolean getShowSubtitleButton() {
        return this.f22591b.A(this.f22635x);
    }

    public int getShowTimeoutMs() {
        return this.f22622q0;
    }

    public boolean getShowVrButton() {
        return this.f22591b.A(this.f22633w);
    }

    public boolean h0() {
        return getVisibility() == 0;
    }

    public void i0() {
        Iterator<m> it = this.f22597e.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    public final void j0(View view) {
        if (this.f22610k0 == null) {
            return;
        }
        boolean z10 = !this.f22612l0;
        this.f22612l0 = z10;
        v0(this.f22637y, z10);
        v0(this.f22639z, this.f22612l0);
        d dVar = this.f22610k0;
        if (dVar != null) {
            dVar.onFullScreenModeChanged(this.f22612l0);
        }
    }

    public final void k0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.f22611l.isShowing()) {
            D0();
            this.f22611l.update(view, (getWidth() - this.f22611l.getWidth()) - this.f22613m, (-this.f22611l.getHeight()) - this.f22613m, -1, -1);
        }
    }

    public final void l0(int i10) {
        if (i10 == 0) {
            Y(this.f22603h, (View) s7.a.e(this.A));
        } else if (i10 == 1) {
            Y(this.f22607j, (View) s7.a.e(this.A));
        } else {
            this.f22611l.dismiss();
        }
    }

    @Deprecated
    public void m0(m mVar) {
        this.f22597e.remove(mVar);
    }

    public void n0() {
        View view = this.f22619p;
        if (view != null) {
            view.requestFocus();
        }
    }

    public final void o0(com.google.android.exoplayer2.v vVar, int i10, long j10) {
        vVar.seekTo(i10, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22591b.O();
        this.f22614m0 = true;
        if (f0()) {
            this.f22591b.W();
        }
        s0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22591b.P();
        this.f22614m0 = false;
        removeCallbacks(this.K);
        this.f22591b.V();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f22591b.Q(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public final void p0(com.google.android.exoplayer2.v vVar, long j10) {
        int currentMediaItemIndex;
        com.google.android.exoplayer2.c0 currentTimeline = vVar.getCurrentTimeline();
        if (this.f22618o0 && !currentTimeline.u()) {
            int iT = currentTimeline.t();
            currentMediaItemIndex = 0;
            while (true) {
                long jG = currentTimeline.r(currentMediaItemIndex, this.J).g();
                if (j10 < jG) {
                    break;
                }
                if (currentMediaItemIndex == iT - 1) {
                    j10 = jG;
                    break;
                } else {
                    j10 -= jG;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = vVar.getCurrentMediaItemIndex();
        }
        o0(vVar, currentMediaItemIndex, j10);
        A0();
    }

    public final boolean q0() {
        com.google.android.exoplayer2.v vVar = this.f22606i0;
        return (vVar == null || vVar.getPlaybackState() == 4 || this.f22606i0.getPlaybackState() == 1 || !this.f22606i0.getPlayWhenReady()) ? false : true;
    }

    public void r0() {
        this.f22591b.b0();
    }

    public void s0() {
        y0();
        x0();
        B0();
        E0();
        G0();
        z0();
        F0();
    }

    public void setAnimationEnabled(boolean z10) {
        this.f22591b.X(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable d dVar) {
        this.f22610k0 = dVar;
        w0(this.f22637y, dVar != null);
        w0(this.f22639z, dVar != null);
    }

    public void setPlayer(@Nullable com.google.android.exoplayer2.v vVar) {
        boolean z10 = true;
        s7.a.g(Looper.myLooper() == Looper.getMainLooper());
        if (vVar != null && vVar.getApplicationLooper() != Looper.getMainLooper()) {
            z10 = false;
        }
        s7.a.a(z10);
        com.google.android.exoplayer2.v vVar2 = this.f22606i0;
        if (vVar2 == vVar) {
            return;
        }
        if (vVar2 != null) {
            vVar2.c(this.f22595d);
        }
        this.f22606i0 = vVar;
        if (vVar != null) {
            vVar.f(this.f22595d);
        }
        s0();
    }

    public void setProgressUpdateListener(@Nullable f fVar) {
        this.f22608j0 = fVar;
    }

    public void setRepeatToggleModes(int i10) {
        this.f22626s0 = i10;
        com.google.android.exoplayer2.v vVar = this.f22606i0;
        if (vVar != null) {
            int repeatMode = vVar.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.f22606i0.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.f22606i0.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.f22606i0.setRepeatMode(2);
            }
        }
        this.f22591b.Y(this.f22629u, i10 != 0);
        B0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f22591b.Y(this.f22621q, z10);
        x0();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f22616n0 = z10;
        F0();
    }

    public void setShowNextButton(boolean z10) {
        this.f22591b.Y(this.f22617o, z10);
        x0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f22591b.Y(this.f22615n, z10);
        x0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f22591b.Y(this.f22623r, z10);
        x0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f22591b.Y(this.f22631v, z10);
        E0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f22591b.Y(this.f22635x, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f22622q0 = i10;
        if (f0()) {
            this.f22591b.W();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f22591b.Y(this.f22633w, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f22624r0 = s7.m0.p(i10, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f22633w;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            t0(onClickListener != null, this.f22633w);
        }
    }

    public final void t0(boolean z10, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.T : this.U);
    }

    public final void u0() {
        com.google.android.exoplayer2.v vVar = this.f22606i0;
        int seekForwardIncrement = (int) ((vVar != null ? vVar.getSeekForwardIncrement() : 15000L) / 1000);
        TextView textView = this.f22625s;
        if (textView != null) {
            textView.setText(String.valueOf(seekForwardIncrement));
        }
        View view = this.f22621q;
        if (view != null) {
            view.setContentDescription(this.f22593c.getQuantityString(R$plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
        }
    }

    public final void v0(@Nullable ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.f22598e0);
            imageView.setContentDescription(this.f22602g0);
        } else {
            imageView.setImageDrawable(this.f22600f0);
            imageView.setContentDescription(this.f22604h0);
        }
    }

    public final void x0() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean z10;
        boolean zIsCommandAvailable3;
        if (h0() && this.f22614m0) {
            com.google.android.exoplayer2.v vVar = this.f22606i0;
            boolean z11 = false;
            if (vVar != null) {
                boolean zIsCommandAvailable4 = vVar.isCommandAvailable(5);
                zIsCommandAvailable2 = vVar.isCommandAvailable(7);
                boolean zIsCommandAvailable5 = vVar.isCommandAvailable(11);
                zIsCommandAvailable3 = vVar.isCommandAvailable(12);
                zIsCommandAvailable = vVar.isCommandAvailable(9);
                z10 = zIsCommandAvailable4;
                z11 = zIsCommandAvailable5;
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                z10 = false;
                zIsCommandAvailable3 = false;
            }
            if (z11) {
                C0();
            }
            if (zIsCommandAvailable3) {
                u0();
            }
            t0(zIsCommandAvailable2, this.f22615n);
            t0(z11, this.f22623r);
            t0(zIsCommandAvailable3, this.f22621q);
            t0(zIsCommandAvailable, this.f22617o);
            l0 l0Var = this.F;
            if (l0Var != null) {
                l0Var.setEnabled(z10);
            }
        }
    }

    public final void y0() {
        if (h0() && this.f22614m0 && this.f22619p != null) {
            if (q0()) {
                ((ImageView) this.f22619p).setImageDrawable(this.f22593c.getDrawable(R$drawable.exo_styled_controls_pause));
                this.f22619p.setContentDescription(this.f22593c.getString(R$string.exo_controls_pause_description));
            } else {
                ((ImageView) this.f22619p).setImageDrawable(this.f22593c.getDrawable(R$drawable.exo_styled_controls_play));
                this.f22619p.setContentDescription(this.f22593c.getString(R$string.exo_controls_play_description));
            }
        }
    }

    public final void z0() {
        com.google.android.exoplayer2.v vVar = this.f22606i0;
        if (vVar == null) {
            return;
        }
        this.f22603h.updateSelectedIndex(vVar.getPlaybackParameters().f22486b);
        this.f22601g.setSubTextAtPosition(0, this.f22603h.getSelectedText());
    }
}
