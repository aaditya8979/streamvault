package hc;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.databinding.ObservableField;
import com.dramarush.shortin.R;
import com.mgs.carparking.model.CHANNELVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;

/* JADX INFO: compiled from: ITEMCHANNELSEARCHRESULTVIEWMODEL.java */
/* JADX INFO: loaded from: classes4.dex */
public class p0 extends np.c<CHANNELVIEWMODEL> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecommandVideosEntity f63305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f63306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<SpannableString> f63307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<String> f63308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pp.b f63309f;

    public p0(@NonNull CHANNELVIEWMODEL channelviewmodel, RecommandVideosEntity recommandVideosEntity) {
        super(channelviewmodel);
        this.f63307d = new ObservableField<>();
        this.f63308e = new ObservableField<>();
        this.f63309f = new pp.b(new pp.a() { // from class: hc.o0
            @Override // pp.a
            public final void call() {
                this.f63290a.b();
            }
        });
        this.f63305b = recommandVideosEntity;
        if (recommandVideosEntity.getIcon_type() == 1) {
            this.f63306c = ContextCompat.getDrawable(channelviewmodel.getApplication(), R.drawable.ic_video_hot_play);
        } else if (recommandVideosEntity.getIcon_type() == 2) {
            this.f63306c = ContextCompat.getDrawable(channelviewmodel.getApplication(), R.drawable.ic_video_high_score);
        }
        if (recommandVideosEntity.getType_pid() == 1) {
            if (zp.o.b(recommandVideosEntity.getVod_douban_score())) {
                return;
            }
            this.f63307d.set(ed.e.m(recommandVideosEntity.getVod_douban_score()));
            return;
        }
        if (recommandVideosEntity.getType_pid() != 2 && recommandVideosEntity.getType_pid() != 4) {
            this.f63308e.set(recommandVideosEntity.getCollection_new_title() + "");
            return;
        }
        if (recommandVideosEntity.getVod_isend() != 1) {
            this.f63308e.set(zp.r.b().getResources().getString(R.string.text_up_colections, recommandVideosEntity.getVod_serial()));
            return;
        }
        this.f63308e.set(recommandVideosEntity.getVod_total() + zp.r.b().getResources().getString(R.string.text_colections));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        ((CHANNELVIEWMODEL) this.f75954a).T(this.f63305b);
    }
}
