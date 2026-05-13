package com.mgs.carparking.util.floatUtil;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.dramarush.shortin.R;
import com.mgs.carparking.ui.MainActivity;
import com.unity3d.services.UnityAdsConstants;
import ed.d0;
import ed.l0;
import ic.i;
import ic.y;
import pb.g;

/* JADX INFO: loaded from: classes5.dex */
public class FloatClingView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f45007b;

    public class a implements d0.b {
        public a() {
        }

        @Override // ed.d0.b
        public void a(long j10) {
            Log.i("wangyi", "111");
            if (l0.X() <= l0.k()) {
                l0.i1(l0.X() + UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            } else {
                FloatClingView.this.f45007b.b();
                FloatClingView.this.f45007b = null;
            }
        }
    }

    public class b implements View.OnClickListener {

        public class a implements ob.a {
            public a() {
            }

            @Override // ob.a
            public void a(g gVar) {
                Log.i("wangyi", "停止成功");
            }

            @Override // ob.a
            public void b(g gVar) {
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            nb.a aVar = MainActivity.mClingPlayControl;
            if (aVar != null) {
                aVar.b(new a());
            }
            op.a.a().b(new y());
            op.a.a().b(new i());
        }
    }

    public FloatClingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public FloatClingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
    }

    public final void c() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_cling_float, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f45007b.c(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, new a());
        viewInflate.findViewById(R.id.iv_delete).setOnClickListener(new b());
        addView(viewInflate, layoutParams);
    }
}
