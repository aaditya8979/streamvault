package hc;

import android.text.Html;
import android.text.Spanned;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.DiscussListEntry;

/* JADX INFO: compiled from: ITEMCOMMENTVIDEOSECONDVIEWMODEL.java */
/* JADX INFO: loaded from: classes3.dex */
public class u0 extends np.c<VIDEOPLAYDETAILVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DiscussListEntry f63390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<Spanned> f63393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f63394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f63395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pp.b f63396h;

    public u0(@NonNull VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, DiscussListEntry discussListEntry, int i10, int i11) {
        super(videoplaydetailviewmodel);
        this.f63393e = new ObservableField<>();
        this.f63394f = "";
        this.f63395g = "";
        this.f63396h = new pp.b(new pp.c() { // from class: hc.t0
            @Override // pp.c
            public final void call(Object obj) {
                this.f63365a.b((View) obj);
            }
        });
        this.f63390b = discussListEntry;
        this.f63391c = i10;
        this.f63392d = i11;
        this.f63394f = "<font color=\"#999999\">" + discussListEntry.getNickname() + "</font>";
        this.f63395g = "<font color=\"#000000\">：" + discussListEntry.getContent() + "</font>";
        this.f63393e.set(Html.fromHtml(this.f63394f + this.f63395g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (ed.l0.T() == this.f63390b.getUser_id()) {
            ((VIDEOPLAYDETAILVIEWMODEL) this.f75954a).S.set(this);
            ((VIDEOPLAYDETAILVIEWMODEL) this.f75954a).R.postValue(view);
        }
    }
}
