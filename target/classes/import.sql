/* Pacientes */
insert into tb_paciente (id, nome, data_nascimento, cpf, observacoes) values (1, 'ELAINE DA SILVA SOUZA', to_date('15/06/1988', 'dd/mm/yyyy'), '57017050134', 'Sem Observações');
insert into tb_paciente (id, nome, data_nascimento, cpf, observacoes) values (2, 'FERNANDO BARROS QUEIROZ', to_date('01/01/1992', 'dd/mm/yyyy'), '36059668968', 'Sem Observações');
insert into tb_paciente (id, nome, data_nascimento, cpf, observacoes) values (3, 'MARIANGELA MENDES DA CRUZ SANTOS', to_date('02/07/1985', 'dd/mm/yyyy'), '61630403172', 'Sem Observações');
insert into tb_paciente (id, nome, data_nascimento, cpf, observacoes) values (4, 'PABLO BARROS TORRES', to_date('26/11/1997', 'dd/mm/yyyy'), '97988693115', 'Sem Observações');
insert into tb_paciente (id, nome, data_nascimento, cpf, observacoes) values (5, 'ROBERVAL DE OLIVEIRA', to_date('30/07/1976', 'dd/mm/yyyy'), '94496870134', 'Sem Observações');
insert into tb_paciente (id, nome, data_nascimento, cpf, observacoes) values (6, 'HELDER RODRIGUES MARTINS SOARES', to_date('21/09/1987', 'dd/mm/yyyy'), '74170066120', 'Sem Observações');
insert into tb_paciente (id, nome, data_nascimento, cpf, observacoes) values (7, 'SIMONE RODOVALDO SILVA', to_date('08/08/2000', 'dd/mm/yyyy'), '11130668738', 'Sem Observações');

/* Médicos */
insert into tb_medico (id, nome, cr) values (1, 'JULIANA BONFIN', '5215');
insert into tb_medico (id, nome, cr) values (2, 'GUSTAVO INÁCIO DE GOMES MARQUES', '5421');
insert into tb_medico (id, nome, cr) values (3, 'GABRIEL FELIPE SANTIAGO', '1254');
insert into tb_medico (id, nome, cr) values (4, 'DRA. BRUNA THOME RASSI', '1854');
insert into tb_medico (id, nome, cr) values (5, 'EDUARDO QUEIRÓS MIRANDA', '4574');
insert into tb_medico (id, nome, cr) values (6, 'LAURA T. RODRIGUES DA CUNHA', '2512');

/* Exames */
insert into tb_exame (id, descricao, dias_conclusao) values (1, 'CREATININA', 3);
insert into tb_exame (id, descricao, dias_conclusao) values (2, 'HEMÁCIAS (GLÓBULOS VERMELHOS)', 5);
insert into tb_exame (id, descricao, dias_conclusao) values (3, 'LEUCÓCITOS (GLÓBULOS BRANCOS)', 5);
insert into tb_exame (id, descricao, dias_conclusao) values (4, 'PLAQUETAS', 3);
insert into tb_exame (id, descricao, dias_conclusao) values (5, 'UREIA', 5);
insert into tb_exame (id, descricao, dias_conclusao) values (6, 'CREATININA', 2);
insert into tb_exame (id, descricao, dias_conclusao) values (7, 'GLICOSE', 2);
insert into tb_exame (id, descricao, dias_conclusao) values (8, 'COLESTEROL', 2);

/* Protocolos */
insert into tb_protocolo (id, paciente_id, medico_id, status) values (1, 2, 2, 'A');
insert into tb_protocolo (id, paciente_id, medico_id, status) values (2, 7, 3, 'A');
insert into tb_protocolo (id, paciente_id, medico_id, status) values (3, 7, 6, 'E');

/* Itens Protocolo */
insert into tb_item_protocolo (id, protocolo_id, exame_id, data_liberacao_prevista, data_liberacao, observacoes) values (1, 1, 1, sysdate(), sysdate(), 'Sem Observações');
insert into tb_item_protocolo (id, protocolo_id, exame_id, data_liberacao_prevista, data_liberacao, observacoes) values (2, 1, 3, sysdate(), sysdate(), 'Sem Observações');
insert into tb_item_protocolo (id, protocolo_id, exame_id, data_liberacao_prevista, data_liberacao, observacoes) values (3, 1, 5, sysdate(), sysdate(), 'Sem Observações');
insert into tb_item_protocolo (id, protocolo_id, exame_id, data_liberacao_prevista, data_liberacao, observacoes) values (4, 1, 6, sysdate(), sysdate(), 'Sem Observações');

insert into tb_item_protocolo (id, protocolo_id, exame_id, data_liberacao_prevista, data_liberacao, observacoes) values (5, 2, 8, sysdate(), sysdate(), 'Sem Observações');
insert into tb_item_protocolo (id, protocolo_id, exame_id, data_liberacao_prevista, data_liberacao, observacoes) values (6, 2, 6, sysdate(), sysdate(), 'Sem Observações');

insert into tb_item_protocolo (id, protocolo_id, exame_id, data_liberacao_prevista, data_liberacao, observacoes) values (7, 3, 3, sysdate(), sysdate(), 'Sem Observações');
insert into tb_item_protocolo (id, protocolo_id, exame_id, data_liberacao_prevista, data_liberacao, observacoes) values (8, 3, 4, sysdate(), sysdate(), 'Sem Observações');
insert into tb_item_protocolo (id, protocolo_id, exame_id, data_liberacao_prevista, data_liberacao, observacoes) values (9, 3, 5, sysdate(), sysdate(), 'Sem Observações');

