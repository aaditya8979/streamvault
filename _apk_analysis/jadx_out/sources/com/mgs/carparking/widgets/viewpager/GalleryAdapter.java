package com.mgs.carparking.widgets.viewpager;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import java.util.List;
import ud.c;

/* JADX INFO: loaded from: classes11.dex */
public class GalleryAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<RecommandVideosEntity> f45667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f45668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f45669d;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45670b;

        public a(int i10) {
            this.f45670b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.i("wangyi", "点击了");
            b bVar = GalleryAdapter.this.f45669d;
            if (bVar != null) {
                bVar.a(this.f45670b);
            }
        }
    }

    public interface b {
        void a(int i10);
    }

    public GalleryAdapter(Context context, List<RecommandVideosEntity> list) {
        this.f45668c = context;
        this.f45667b = list;
    }

    public void a(b bVar) {
        this.f45669d = bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f45667b.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(this.f45668c).inflate(R.layout.item_home_multiple_gallery_item_content, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.item_img);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        textView.setText(this.f45667b.get(i10).getName());
        c.c(this.f45668c, this.f45667b.get(i10).getCoverUrl(), R.drawable.ic_video_default, R.drawable.ic_video_default, imageView, false);
        viewInflate.setOnClickListener(new a(i10));
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
