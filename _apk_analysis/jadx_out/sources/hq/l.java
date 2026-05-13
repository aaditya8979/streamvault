package hq;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.PrintWriter;
import java.io.Writer;
import org.eclipse.jetty.io.RuntimeIOException;

/* JADX INFO: compiled from: UncheckedPrintWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public class l extends PrintWriter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final vq.c f63603f = vq.b.a(l.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f63605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f63606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f63607e;

    public l(Writer writer) {
        this(writer, false);
    }

    public l(Writer writer, boolean z10) {
        super(writer, z10);
        this.f63606d = false;
        this.f63604b = z10;
        this.f63607e = System.getProperty("line.separator");
    }

    @Override // java.io.PrintWriter
    public boolean checkError() {
        return this.f63605c != null || super.checkError();
    }

    @Override // java.io.PrintWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            synchronized (((PrintWriter) this).lock) {
                ((PrintWriter) this).out.close();
                this.f63606d = true;
            }
        } catch (IOException e10) {
            k(e10);
        }
    }

    public final void d() throws IOException {
        if (this.f63605c != null) {
            throw new RuntimeIOException(this.f63605c);
        }
        if (this.f63606d) {
            throw new IOException("Stream closed");
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer, java.io.Flushable
    public void flush() {
        try {
            synchronized (((PrintWriter) this).lock) {
                d();
                ((PrintWriter) this).out.flush();
            }
        } catch (IOException e10) {
            k(e10);
        }
    }

    public final void h() {
        try {
            synchronized (((PrintWriter) this).lock) {
                d();
                ((PrintWriter) this).out.write(this.f63607e);
                if (this.f63604b) {
                    ((PrintWriter) this).out.flush();
                }
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e10) {
            k(e10);
        }
    }

    public final void k(Throwable th2) {
        super.setError();
        if (th2 instanceof IOException) {
            this.f63605c = (IOException) th2;
        } else {
            IOException iOException = new IOException(String.valueOf(th2));
            this.f63605c = iOException;
            iOException.initCause(th2);
        }
        f63603f.b(th2);
    }

    @Override // java.io.PrintWriter
    public void print(char c10) {
        write(c10);
    }

    @Override // java.io.PrintWriter
    public void print(double d10) {
        write(String.valueOf(d10));
    }

    @Override // java.io.PrintWriter
    public void print(float f10) {
        write(String.valueOf(f10));
    }

    @Override // java.io.PrintWriter
    public void print(int i10) {
        write(String.valueOf(i10));
    }

    @Override // java.io.PrintWriter
    public void print(long j10) {
        write(String.valueOf(j10));
    }

    @Override // java.io.PrintWriter
    public void print(Object obj) {
        write(String.valueOf(obj));
    }

    @Override // java.io.PrintWriter
    public void print(String str) {
        if (str == null) {
            str = "null";
        }
        write(str);
    }

    @Override // java.io.PrintWriter
    public void print(boolean z10) {
        write(z10 ? "true" : com.ironsource.mediationsdk.metadata.a.f32683h);
    }

    @Override // java.io.PrintWriter
    public void print(char[] cArr) {
        write(cArr);
    }

    @Override // java.io.PrintWriter
    public void println() {
        h();
    }

    @Override // java.io.PrintWriter
    public void println(char c10) {
        synchronized (((PrintWriter) this).lock) {
            print(c10);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void println(double d10) {
        synchronized (((PrintWriter) this).lock) {
            print(d10);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void println(float f10) {
        synchronized (((PrintWriter) this).lock) {
            print(f10);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void println(int i10) {
        synchronized (((PrintWriter) this).lock) {
            print(i10);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void println(long j10) {
        synchronized (((PrintWriter) this).lock) {
            print(j10);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void println(Object obj) {
        synchronized (((PrintWriter) this).lock) {
            print(obj);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void println(String str) {
        synchronized (((PrintWriter) this).lock) {
            print(str);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void println(boolean z10) {
        synchronized (((PrintWriter) this).lock) {
            print(z10);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void println(char[] cArr) {
        synchronized (((PrintWriter) this).lock) {
            print(cArr);
            println();
        }
    }

    @Override // java.io.PrintWriter
    public void setError() {
        k(new IOException());
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(int i10) {
        try {
            synchronized (((PrintWriter) this).lock) {
                d();
                ((PrintWriter) this).out.write(i10);
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e10) {
            k(e10);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str) {
        write(str, 0, str.length());
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(String str, int i10, int i11) {
        try {
            synchronized (((PrintWriter) this).lock) {
                d();
                ((PrintWriter) this).out.write(str, i10, i11);
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e10) {
            k(e10);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        try {
            synchronized (((PrintWriter) this).lock) {
                d();
                ((PrintWriter) this).out.write(cArr, i10, i11);
            }
        } catch (InterruptedIOException unused) {
            Thread.currentThread().interrupt();
        } catch (IOException e10) {
            k(e10);
        }
    }
}
