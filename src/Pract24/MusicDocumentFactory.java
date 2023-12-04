package Pract24;

public class MusicDocumentFactory implements ICreateDocument{
    @Override
    public IDocument createDocument() {
        return new MusicDocument();
    }
    @Override
    public IDocument openDocument() {
        return new MusicDocument();
    }
}
