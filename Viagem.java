public class Viagem {
    private String destino;
    private float distanciaTotal;
    private Motorista motorista;
    private Veiculo veiculo;
    
    public void setDestino(String destino) {
        if (destino == null || destino.trim().isEmpty())
            throw new IllegalArgumentException("O destino não pode ser vazio.");
        this.destino = destino.trim();
    }

    public void setDistanciaTotal(float distancia) {
        if (distancia <= 0)
            throw new IllegalArgumentException("A distância total deve ser maior que zero.");
        this.distanciaTotal = distancia;
    }

    public void setMotorista(Motorista motorista) {
        if (motorista == null)
            throw new IllegalArgumentException("O motorista não pode ser nulo.");
        this.motorista = motorista;
    }

    public void setVeiculo(Veiculo veiculo) {
        if (veiculo == null)
            throw new IllegalArgumentException("O veículo não pode ser nulo.");
        this.veiculo = veiculo;
    }

    public void iniciarViagem() {
        System.out.println("\n=== Iniciando Viagem para: " + destino + " ===");

        if (!motorista.cnhValida()) {
            System.out.println("  [ERRO] Viagem não iniciada: CNH do motorista " + motorista.getNome() +
                               " está vencida (validade: " + motorista.getValidadeCnh() + ").");
            return;
        }

        System.out.println("  [OK] Motorista: " + motorista.getNome() + " | CNH válida até " + motorista.getValidadeCnh());
        veiculo.statusCombustivel();

        boolean chegou = veiculo.viajar(distanciaTotal);

        if (chegou) {
            System.out.println("  [OK] Viagem concluída com sucesso!");
            veiculo.statusCombustivel();
        } else {
            System.out.println("  [ERRO] Viagem interrompida por falta de combustível.");
        }
    }

        public String getDestino() 
            { return destino; }

    public float getDistanciaTotal()

        { return distanciaTotal; }

    public Motorista getMotorista() 
        { return motorista; }

    public Veiculo getVeiculo() 
        { return veiculo; }

    
    public void gerarRelatorio() {
        System.out.println("\n--- Relatório de Viagem ---");
        System.out.println("  Destino       : " + destino);
        System.out.println("  Distância     : " + distanciaTotal + " km");
        System.out.println("  Motorista     : " + motorista.getNome() + " (CPF: " + motorista.getCpf() + ")");
        System.out.println("  CNH           : " + motorista.getCnh() + " | Validade: " + motorista.getValidadeCnh());
        System.out.println("  Veículo       : " + veiculo.getModelo() + " | Placa: " + veiculo.getPlaca());
        System.out.println("  Combustível   : " + veiculo.getCombustivelAtual() + "L / " + veiculo.getCapacidadeTanque() + "L");
        System.out.println("---------------------------");
    }

}
