package hc;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import com.mgs.carparking.model.FEEDBACKRECORDVIEWMODEL;
import com.mgs.carparking.netbean.FeedbackRecordEntry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: ITEMFEEDBACKRECORDVIEWMODEL.java */
/* JADX INFO: loaded from: classes12.dex */
public class o1 extends np.e<FEEDBACKRECORDVIEWMODEL> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FeedbackRecordEntry f63291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObservableField<Boolean> f63292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ObservableField<Boolean> f63293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObservableField<String> f63294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ObservableField<SpannableStringBuilder> f63295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public pp.b f63296h;

    /* JADX INFO: compiled from: ITEMFEEDBACKRECORDVIEWMODEL.java */
    public class a extends ClickableSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FEEDBACKRECORDVIEWMODEL f63297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f63298c;

        public a(FEEDBACKRECORDVIEWMODEL feedbackrecordviewmodel, String str) {
            this.f63297b = feedbackrecordviewmodel;
            this.f63298c = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            this.f63297b.f43987r.setValue(this.f63298c);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#365899"));
            textPaint.setUnderlineText(false);
        }
    }

    public o1(@NonNull FEEDBACKRECORDVIEWMODEL feedbackrecordviewmodel, FeedbackRecordEntry feedbackRecordEntry, String str, int i10) {
        super(feedbackrecordviewmodel);
        Boolean bool = Boolean.TRUE;
        this.f63292d = new ObservableField<>(bool);
        Boolean bool2 = Boolean.FALSE;
        this.f63293e = new ObservableField<>(bool2);
        this.f63294f = new ObservableField<>();
        this.f63295g = new ObservableField<>();
        this.f63296h = new pp.b(new pp.a() { // from class: hc.n1
            @Override // pp.a
            public final void call() {
                this.f63286a.c();
            }
        });
        this.f63291c = feedbackRecordEntry;
        this.f75958b = str;
        if (i10 == 0) {
            this.f63292d.set(bool2);
        } else {
            this.f63292d.set(bool);
        }
        if (!zp.o.b(ed.l0.S())) {
            this.f63294f.set(ed.l0.S());
        }
        String reply_content = feedbackRecordEntry.getReply_content();
        if (!zp.o.b(reply_content)) {
            Matcher matcher = Pattern.compile("#(.+)#").matcher(reply_content);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(reply_content);
            if (matcher.find()) {
                spannableStringBuilder.setSpan(new a(feedbackrecordviewmodel, matcher.group(1)), reply_content.indexOf("#"), reply_content.length(), 33);
                this.f63295g.set(spannableStringBuilder);
            } else {
                this.f63295g.set(spannableStringBuilder);
            }
        }
        if (zp.o.b(feedbackRecordEntry.getReply_content())) {
            this.f63293e.set(bool2);
        } else {
            this.f63293e.set(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        ed.e.c(this.f63291c.getContent());
    }
}
