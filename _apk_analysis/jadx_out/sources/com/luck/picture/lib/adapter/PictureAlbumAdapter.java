package com.luck.picture.lib.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.style.AlbumWindowStyle;
import java.util.ArrayList;
import java.util.List;
import ma.d;
import oa.f;

/* JADX INFO: loaded from: classes4.dex */
public class PictureAlbumAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<LocalMediaFolder> f34835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ra.a f34836j;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f34837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LocalMediaFolder f34838c;

        public a(int i10, LocalMediaFolder localMediaFolder) {
            this.f34837b = i10;
            this.f34838c = localMediaFolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PictureAlbumAdapter.this.f34836j == null) {
                return;
            }
            PictureAlbumAdapter.this.f34836j.a(this.f34837b, this.f34838c);
        }
    }

    public static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImageView f34840l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f34841m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public TextView f34842n;

        public b(View view) {
            super(view);
            this.f34840l = (ImageView) view.findViewById(R$id.first_image);
            this.f34841m = (TextView) view.findViewById(R$id.tv_folder_name);
            this.f34842n = (TextView) view.findViewById(R$id.tv_select_tag);
            AlbumWindowStyle albumWindowStyleA = PictureSelectionConfig.T0.a();
            int iC = albumWindowStyleA.c();
            if (iC != 0) {
                view.setBackgroundResource(iC);
            }
            int iD = albumWindowStyleA.d();
            if (iD != 0) {
                this.f34842n.setBackgroundResource(iD);
            }
            int iE = albumWindowStyleA.e();
            if (iE != 0) {
                this.f34841m.setTextColor(iE);
            }
            int iF = albumWindowStyleA.f();
            if (iF > 0) {
                this.f34841m.setTextSize(iF);
            }
        }
    }

    public void d(List<LocalMediaFolder> list) {
        this.f34835i = new ArrayList(list);
    }

    public List<LocalMediaFolder> e() {
        List<LocalMediaFolder> list = this.f34835i;
        return list != null ? list : new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        LocalMediaFolder localMediaFolder = this.f34835i.get(i10);
        String strH = localMediaFolder.h();
        int i11 = localMediaFolder.i();
        String strF = localMediaFolder.f();
        bVar.f34842n.setVisibility(localMediaFolder.k() ? 0 : 4);
        LocalMediaFolder localMediaFolderJ = va.a.j();
        bVar.itemView.setSelected(localMediaFolderJ != null && localMediaFolder.c() == localMediaFolderJ.c());
        if (d.d(localMediaFolder.g())) {
            bVar.f34840l.setImageResource(R$drawable.ps_audio_placeholder);
        } else {
            f fVar = PictureSelectionConfig.K0;
            if (fVar != null) {
                fVar.e(bVar.itemView.getContext(), strF, bVar.f34840l);
            }
        }
        bVar.f34841m.setText(bVar.itemView.getContext().getString(R$string.ps_camera_roll_num, strH, Integer.valueOf(i11)));
        bVar.itemView.setOnClickListener(new a(i10, localMediaFolder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        int iA = ma.b.a(viewGroup.getContext(), 6);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (iA == 0) {
            iA = R$layout.ps_album_folder_item;
        }
        return new b(layoutInflaterFrom.inflate(iA, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f34835i.size();
    }

    public void h(ra.a aVar) {
        this.f34836j = aVar;
    }
}
