package cloud.shaick.desafioLiterAlura.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);

}