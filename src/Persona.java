import java.math.BigDecimal;
public class Persona {
    private String nome;
    private String cognome;
    private int eta;
    private String indirizzo;
    private BigDecimal salario;

    public Persona(PersonaBuilder personaBuilder){
        this.nome = personaBuilder.nome;
        this.cognome = personaBuilder.cognome;
        this.eta = personaBuilder.eta;
    }

    public static class PersonaBuilder {

        private String nome;
        private String cognome;
        private int eta;
        private String indirizzo;
        private BigDecimal salario;

        public PersonaBuilder(String nome, String cognome){
            this.nome = nome;
            this.cognome = cognome;
        };

        public PersonaBuilder setEta(int eta) throws AgeErrorException{
            if(eta < 0){
                throw new AgeErrorException("Errore: età minore di zero!");
            }
            this.eta = eta;
            return this;
        }

        public PersonaBuilder setNome(String nome){
            this.nome = nome;
            return this;
        }

        public PersonaBuilder setCognome(String cognome){
            this.cognome = cognome;
            return this;
        }

        public Persona build(){
            return new Persona(this);
        }
    }

    }

