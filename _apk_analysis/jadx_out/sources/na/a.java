package na;

import ab.e;
import ab.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;
import com.luck.picture.lib.adapter.PictureAlbumAdapter;
import com.luck.picture.lib.decoration.WrapContentLinearLayoutManager;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.List;

/* JADX INFO: compiled from: AlbumListPopWindow.java */
/* JADX INFO: loaded from: classes4.dex */
public class a extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f75727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f75728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f75729d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PictureAlbumAdapter f75731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f75732g;

    /* JADX INFO: renamed from: na.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AlbumListPopWindow.java */
    public class ViewOnClickListenerC0896a implements View.OnClickListener {
        public ViewOnClickListenerC0896a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: AlbumListPopWindow.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (l.b()) {
                a.this.dismiss();
            }
        }
    }

    /* JADX INFO: compiled from: AlbumListPopWindow.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.super.dismiss();
            a.this.f75729d = false;
        }
    }

    /* JADX INFO: compiled from: AlbumListPopWindow.java */
    public interface d {
        void a();

        void b();
    }

    public a(Context context) {
        this.f75726a = context;
        setContentView(LayoutInflater.from(context).inflate(R$layout.ps_window_folder, (ViewGroup) null));
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(R$style.PictureThemeWindowStyle);
        setFocusable(true);
        setOutsideTouchable(true);
        update();
        j();
    }

    public static a d(Context context) {
        return new a(context);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void c(List<LocalMediaFolder> list) {
        this.f75731f.d(list);
        this.f75731f.notifyDataSetChanged();
        this.f75728c.getLayoutParams().height = list.size() > 8 ? this.f75730e : -2;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (this.f75729d) {
            return;
        }
        this.f75727b.setAlpha(0.0f);
        d dVar = this.f75732g;
        if (dVar != null) {
            dVar.b();
        }
        this.f75729d = true;
        this.f75727b.post(new c());
    }

    public void e() {
        List<LocalMediaFolder> listE = this.f75731f.e();
        for (int i10 = 0; i10 < listE.size(); i10++) {
            LocalMediaFolder localMediaFolder = listE.get(i10);
            localMediaFolder.t(false);
            this.f75731f.notifyItemChanged(i10);
            for (int i11 = 0; i11 < va.a.l(); i11++) {
                if (TextUtils.equals(localMediaFolder.h(), va.a.n().get(i11).v()) || localMediaFolder.c() == -1) {
                    localMediaFolder.t(true);
                    this.f75731f.notifyItemChanged(i10);
                    break;
                }
            }
        }
    }

    public List<LocalMediaFolder> f() {
        return this.f75731f.e();
    }

    public int g() {
        if (i() > 0) {
            return h(0).i();
        }
        return 0;
    }

    public LocalMediaFolder h(int i10) {
        if (this.f75731f.e().size() <= 0 || i10 >= this.f75731f.e().size()) {
            return null;
        }
        return this.f75731f.e().get(i10);
    }

    public int i() {
        return this.f75731f.e().size();
    }

    public final void j() {
        this.f75730e = (int) (((double) e.g(this.f75726a)) * 0.6d);
        this.f75728c = (RecyclerView) getContentView().findViewById(R$id.folder_list);
        this.f75727b = getContentView().findViewById(R$id.rootViewBg);
        this.f75728c.setLayoutManager(new WrapContentLinearLayoutManager(this.f75726a));
        PictureAlbumAdapter pictureAlbumAdapter = new PictureAlbumAdapter();
        this.f75731f = pictureAlbumAdapter;
        this.f75728c.setAdapter(pictureAlbumAdapter);
        this.f75727b.setOnClickListener(new ViewOnClickListenerC0896a());
        getContentView().findViewById(R$id.rootView).setOnClickListener(new b());
    }

    public void k(ra.a aVar) {
        this.f75731f.h(aVar);
    }

    public void l(d dVar) {
        this.f75732g = dVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        if (f() == null || f().size() == 0) {
            return;
        }
        if (l.c()) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            showAtLocation(view, 0, 0, iArr[1] + view.getHeight());
        } else {
            super.showAsDropDown(view);
        }
        this.f75729d = false;
        d dVar = this.f75732g;
        if (dVar != null) {
            dVar.a();
        }
        this.f75727b.animate().alpha(1.0f).setDuration(250L).setStartDelay(250L).start();
        e();
    }
}
