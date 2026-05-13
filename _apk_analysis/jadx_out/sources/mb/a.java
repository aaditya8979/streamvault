package mb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.adapter.BannerViewHolder;
import java.util.ArrayList;
import java.util.List;
import ud.c;
import zp.o;

/* JADX INFO: compiled from: MyBannerAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public class a implements od.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<RecommandVideosEntity> f74099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f74100b;

    /* JADX INFO: renamed from: mb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MyBannerAdapter.java */
    public class C0879a extends BannerViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImageView f74101l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f74102m;

        public C0879a(View view) {
            super(view);
            this.f74101l = (ImageView) view.findViewById(R.id.item_img);
            this.f74102m = (TextView) view.findViewById(R.id.tv_title);
        }
    }

    public a(Context context, List<RecommandVideosEntity> list) {
        new ArrayList();
        this.f74100b = context;
        this.f74099a = list;
    }

    @Override // od.a
    public void a(BannerViewHolder bannerViewHolder, int i10) {
        C0879a c0879a = (C0879a) bannerViewHolder;
        if (o.b(this.f74099a.get(i10).getCoverUrl())) {
            c0879a.f74101l.setImageResource(R.drawable.ic_video_default_horizontal);
        } else {
            c.c(this.f74100b, this.f74099a.get(i10).getCoverUrl(), R.drawable.ic_video_default_horizontal, R.drawable.ic_video_default_horizontal, c0879a.f74101l, false);
        }
        c0879a.f74102m.setText(this.f74099a.get(i10).getName());
    }

    @Override // od.a
    public BannerViewHolder b(ViewGroup viewGroup, int i10) {
        return new C0879a(LayoutInflater.from(this.f74100b).inflate(R.layout.home_banner_item, viewGroup, false));
    }

    @Override // od.a
    public int getCount() {
        return this.f74099a.size();
    }
}
