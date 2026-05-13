package re;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import oe.c;
import oe.d;
import oe.e;
import oe.f;

/* JADX INFO: compiled from: SimpleComponent.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends RelativeLayout implements oe.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f78898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pe.b f78899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public oe.a f78900d;

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NonNull View view) {
        this(view, view instanceof oe.a ? (oe.a) view : null);
    }

    public b(@NonNull View view, @Nullable oe.a aVar) {
        super(view.getContext(), null, 0);
        this.f78898b = view;
        this.f78900d = aVar;
        if ((this instanceof c) && (aVar instanceof d) && aVar.getSpinnerStyle() == pe.b.f77289h) {
            aVar.getView().setScaleY(-1.0f);
            return;
        }
        if (this instanceof d) {
            oe.a aVar2 = this.f78900d;
            if ((aVar2 instanceof c) && aVar2.getSpinnerStyle() == pe.b.f77289h) {
                aVar.getView().setScaleY(-1.0f);
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public boolean a(boolean z10) {
        oe.a aVar = this.f78900d;
        return (aVar instanceof c) && ((c) aVar).a(z10);
    }

    public void b(@NonNull f fVar, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
        oe.a aVar = this.f78900d;
        if (aVar == null || aVar == this) {
            return;
        }
        if ((this instanceof c) && (aVar instanceof d)) {
            if (refreshState.isFooter) {
                refreshState = refreshState.toHeader();
            }
            if (refreshState2.isFooter) {
                refreshState2 = refreshState2.toHeader();
            }
        } else if ((this instanceof d) && (aVar instanceof c)) {
            if (refreshState.isHeader) {
                refreshState = refreshState.toFooter();
            }
            if (refreshState2.isHeader) {
                refreshState2 = refreshState2.toFooter();
            }
        }
        oe.a aVar2 = this.f78900d;
        if (aVar2 != null) {
            aVar2.b(fVar, refreshState, refreshState2);
        }
    }

    public void d(@NonNull f fVar, int i10, int i11) {
        oe.a aVar = this.f78900d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.d(fVar, i10, i11);
    }

    public void e(@NonNull f fVar, int i10, int i11) {
        oe.a aVar = this.f78900d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.e(fVar, i10, i11);
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        return (obj instanceof oe.a) && getView() == ((oe.a) obj).getView();
    }

    @Override // oe.a
    public void f(float f10, int i10, int i11) {
        oe.a aVar = this.f78900d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.f(f10, i10, i11);
    }

    @Override // oe.a
    public boolean g() {
        oe.a aVar = this.f78900d;
        return (aVar == null || aVar == this || !aVar.g()) ? false : true;
    }

    @Override // oe.a
    @NonNull
    public pe.b getSpinnerStyle() {
        int i10;
        pe.b bVar = this.f78899c;
        if (bVar != null) {
            return bVar;
        }
        oe.a aVar = this.f78900d;
        if (aVar != null && aVar != this) {
            return aVar.getSpinnerStyle();
        }
        View view = this.f78898b;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                pe.b bVar2 = ((SmartRefreshLayout.LayoutParams) layoutParams).f53297b;
                this.f78899c = bVar2;
                if (bVar2 != null) {
                    return bVar2;
                }
            }
            if (layoutParams != null && ((i10 = layoutParams.height) == 0 || i10 == -1)) {
                for (pe.b bVar3 : pe.b.f77290i) {
                    if (bVar3.f77293c) {
                        this.f78899c = bVar3;
                        return bVar3;
                    }
                }
            }
        }
        pe.b bVar4 = pe.b.f77285d;
        this.f78899c = bVar4;
        return bVar4;
    }

    @Override // oe.a
    @NonNull
    public View getView() {
        View view = this.f78898b;
        return view == null ? this : view;
    }

    public int j(@NonNull f fVar, boolean z10) {
        oe.a aVar = this.f78900d;
        if (aVar == null || aVar == this) {
            return 0;
        }
        return aVar.j(fVar, z10);
    }

    public void k(@NonNull e eVar, int i10, int i11) {
        oe.a aVar = this.f78900d;
        if (aVar != null && aVar != this) {
            aVar.k(eVar, i10, i11);
            return;
        }
        View view = this.f78898b;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                eVar.b(this, ((SmartRefreshLayout.LayoutParams) layoutParams).f53296a);
            }
        }
    }

    public void n(boolean z10, float f10, int i10, int i11, int i12) {
        oe.a aVar = this.f78900d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.n(z10, f10, i10, i11, i12);
    }

    public void setPrimaryColors(@ColorInt int... iArr) {
        oe.a aVar = this.f78900d;
        if (aVar == null || aVar == this) {
            return;
        }
        aVar.setPrimaryColors(iArr);
    }
}
