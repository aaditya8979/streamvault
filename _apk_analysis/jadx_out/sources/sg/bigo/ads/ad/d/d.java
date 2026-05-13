package sg.bigo.ads.ad.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.d.f;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f80144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f80145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f80146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.a f80147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f80148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80149f;

    public final void a() {
        n nVar = this.f80148e;
        if (nVar != null) {
            nVar.b();
            this.f80149f = false;
        }
    }

    public final void a(ViewGroup viewGroup, int i10, f.a aVar) {
        if (viewGroup == null) {
            return;
        }
        this.f80149f = false;
        this.f80147d = aVar;
        this.f80146c = (ViewGroup) viewGroup.findViewById(R.id.inter_popup_close_btn);
        this.f80144a = (TextView) viewGroup.findViewById(R.id.close_text);
        TextView textView = (TextView) viewGroup.findViewById(R.id.second_text);
        this.f80145b = textView;
        ViewGroup viewGroup2 = this.f80146c;
        if (viewGroup2 == null || this.f80144a == null || textView == null) {
            f.a aVar2 = this.f80147d;
            if (aVar2 != null) {
                aVar2.a();
                return;
            }
            return;
        }
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.d.d.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.a aVar3 = d.this.f80147d;
                if (aVar3 != null) {
                    aVar3.a();
                }
            }
        });
        this.f80146c.setClickable(false);
        this.f80144a.setTextColor(1728053247);
        this.f80145b.setVisibility(0);
        n nVar = new n(((long) i10) * 1000) { // from class: sg.bigo.ads.ad.d.d.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                d dVar = d.this;
                dVar.f80149f = true;
                dVar.f80146c.setAlpha(1.0f);
                d.this.f80146c.setClickable(true);
                d.this.f80145b.setVisibility(8);
                d.this.f80144a.setTextColor(-1);
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
                d.this.f80145b.setText(q.a("%ds", Integer.valueOf(Math.round(j10 / 1000.0f))));
            }
        };
        this.f80148e = nVar;
        nVar.c();
    }
}
