public class Veiculo {
    private String placa;
    private String modelo;
    private float capacidadeTanque;
    private float combustivelAtual;

    public Veiculo(String placa, String modelo, float capacidadeTanque, float combustivelAtual) {
        setPlaca(placa);
        setModelo(modelo);
        setCapacidadeTanque(capacidadeTanque);
        setCombustivelAtual(combustivelAtual);
    }

    // Getters
    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public float getCapacidadeTanque() { return capacidadeTanque; }
    public float getCombustivelAtual() { return combustivelAtual; }

    
    public void setPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty())
            throw new IllegalArgumentException("A placa não pode ser vazia.");
        this.placa = placa.trim();
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty())
            throw new IllegalArgumentException("O modelo não pode ser vazio.");
        this.modelo = modelo.trim();
    }

    public void setCapacidadeTanque(float capacidade) {
        if (capacidade <= 0)
            throw new IllegalArgumentException("A capacidade do tanque deve ser maior que zero.");
        this.capacidadeTanque = capacidade;
    }

    public void setCombustivelAtual(float litros) {
        if (litros < 0)
            throw new IllegalArgumentException("O combustível não pode ser negativo.");
        this.combustivelAtual = litros;
    }

    
    public void abastecer(float litros) {
        if (litros <= 0)
            throw new IllegalArgumentException("A quantidade de litros deve ser positiva.");
        float novoTotal = this.combustivelAtual + litros;
        if (novoTotal > this.capacidadeTanque) {
            this.combustivelAtual = this.capacidadeTanque;
            System.out.println("  [Aviso] Tanque cheio! Abastecido até a capacidade máxima de " + this.capacidadeTanque + "L.");
        } else {
            this.combustivelAtual = novoTotal;
            System.out.println("  [OK] Veículo abastecido. Combustível atual: " + this.combustivelAtual + "L.");
        }
    }

    public boolean viajar(float distancia) {
        if (distancia <= 0)
            throw new IllegalArgumentException("A distância deve ser positiva.");
        float consumo = distancia / 10f;
        if (consumo > this.combustivelAtual) {
            System.out.println("  [ERRO] Combustível insuficiente! Necessário: " + consumo + "L | Disponível: " + this.combustivelAtual + "L.");
            this.combustivelAtual = 0;
            return false;
        }
        this.combustivelAtual -= consumo;
        return true;
    }

    public void statusCombustivel() {
        System.out.println("  Veículo: " + modelo + " (" + placa + ") | Combustível: " + combustivelAtual + "L / " + capacidadeTanque + "L");
    }
}
