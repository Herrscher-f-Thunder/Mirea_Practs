package Pract24;

public class TextDocumentFactory implements ICreateDocument{
    @Override
    public IDocument createDocument() {
        return new TextDocument();
    }

    @Override
    public IDocument openDocument() {
        return new TextDocument();
    }
}
