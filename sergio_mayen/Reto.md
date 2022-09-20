<xml xmlns="http://www.w3.org/1999/xhtml">
  <block type="text_print" id="GbLZ/fIk;!+8S-S/pV%N" x="50" y="50">
    <value name="TEXT">
      <block type="text" id="TvcW=7f]WL2-s9}8TBS/">
        <field name="TEXT">Que comience la batalla</field>
      </block>
    </value>
    <next>
      <block type="text_print" id="+7DU]HZ6d_]g7LjFfaln">
        <value name="TEXT">
          <block type="text" id="kagRavc3uDdF3Bh*RaSI">
            <field name="TEXT">Caballero = 1</field>
          </block>
        </value>
        <next>
          <block type="text_print" id="!?94%d.tBJ;qjU=tr7KY">
            <value name="TEXT">
              <block type="text" id="ho,Y`=7.CECvk/w{qc.W">
                <field name="TEXT">Vampiro = 2</field>
              </block>
            </value>
            <next>
              <block type="variables_set" id="ta1HDK2:M{P0G,}si=Dn">
                <field name="VAR">personaje</field>
                <value name="VALUE">
                  <block type="text_prompt_ext" id="v`c2H;V_[}0~v4pa1HF*">
                    <mutation type="NUMBER"></mutation>
                    <field name="TYPE">NUMBER</field>
                    <value name="TEXT">
                      <block type="text" id="wm6W%:#l!(YI,,2UqusK">
                        <field name="TEXT">Escoje tu personaje</field>
                      </block>
                    </value>
                  </block>
                </value>
                <next>
                  <block type="variables_set" id="`x]!#Vs|/DbP5?QIe3+n">
                    <field name="VAR">heroe</field>
                    <value name="VALUE">
                      <block type="variables_get" id="(}8GjjkdA@gt*CiHWwR:">
                        <field name="VAR">personaje</field>
                      </block>
                    </value>
                    <next>
                      <block type="variables_set" id="~TL:~D`/Ux0dyA1GXT2X">
                        <field name="VAR">vampiro</field>
                        <value name="VALUE">
                          <block type="variables_get" id="Oal;P!%+h|nc-3/KR7NJ">
                            <field name="VAR">personaje</field>
                          </block>
                        </value>
                        <next>
                          <block type="variables_set" id="Ju^gZL4(zyHK^yIEQv(j">
                            <field name="VAR">vidaHeroe</field>
                            <value name="VALUE">
                              <block type="math_number" id="_!k}I7;TW9raI^!+Vs}0">
                                <field name="NUM">50</field>
                              </block>
                            </value>
                            <next>
                              <block type="variables_set" id="+[j=n8#%kM}wG-O~1Jb/">
                                <field name="VAR">vidaVampiro</field>
                                <value name="VALUE">
                                  <block type="math_number" id="Bk2uXZgv]PG{.JAy!5vS">
                                    <field name="NUM">40</field>
                                  </block>
                                </value>
                                <next>
                                  <block type="variables_set" id="GsBH0[K4u,}^]Fiz20md">
                                    <field name="VAR">danoGolpe</field>
                                    <value name="VALUE">
                                      <block type="math_number" id="gidd}~Rn_B#6QE##0gi%">
                                        <field name="NUM">5</field>
                                      </block>
                                    </value>
                                    <next>
                                      <block type="variables_set" id="dmRkwW+71|T],%UU5T[A">
                                        <field name="VAR">danoMordida</field>
                                        <value name="VALUE">
                                          <block type="math_number" id="?8Vj3I/9(e0y`oYEk?(g">
                                            <field name="NUM">3</field>
                                          </block>
                                        </value>
                                        <next>
                                          <block type="controls_if" id="lyqZuuFK{Su?J0V`+YNx">
                                            <mutation elseif="1"></mutation>
                                            <value name="IF0">
                                              <block type="logic_compare" id="y`K]xE3yCxhCt;I^RP%O">
                                                <field name="OP">EQ</field>
                                                <value name="A">
                                                  <block type="variables_get" id="[*R/-TsV~Pb*,o~.x`S|">
                                                    <field name="VAR">personaje</field>
                                                  </block>
                                                </value>
                                                <value name="B">
                                                  <block type="math_number" id="vtn.c*54Mc|miU%@IGNL">
                                                    <field name="NUM">1</field>
                                                  </block>
                                                </value>
                                              </block>
                                            </value>
                                            <statement name="DO0">
                                              <block type="text_print" id="(q*n7tnV_!6r`wk.4!%9">
                                                <value name="TEXT">
                                                  <block type="text" id="ErI=4{ewra6BwS;NFYQe">
                                                    <field name="TEXT">Tu personaje es el caballero</field>
                                                  </block>
                                                </value>
                                                <next>
                                                  <block type="text_print" id="-RHq|@UG[a^E:^b5#MWM">
                                                    <value name="TEXT">
                                                      <block type="text_join" id="FzFtx-Jb5bXO?MxHCa8o">
                                                        <mutation items="3"></mutation>
                                                        <value name="ADD0">
                                                          <block type="text" id="IrwO3eIo@23?X,U6.o%(">
                                                            <field name="TEXT">Tu vida es de: </field>
                                                          </block>
                                                        </value>
                                                        <value name="ADD1">
                                                          <block type="variables_get" id="v_-*Ei=R]rM{n;,V]LA?">
                                                            <field name="VAR">vidaHeroe</field>
                                                          </block>
                                                        </value>
                                                        <value name="ADD2">
                                                          <block type="text" id="0P?cMcWma!@@^gk2m4Z5">
                                                            <field name="TEXT">pts.</field>
                                                          </block>
                                                        </value>
                                                      </block>
                                                    </value>
                                                  </block>
                                                </next>
                                              </block>
                                            </statement>
                                            <value name="IF1">
                                              <block type="logic_compare" id="ix[q+xw}98|MRUH`[9zz">
                                                <field name="OP">EQ</field>
                                                <value name="A">
                                                  <block type="variables_get" id="@,J.j%g22qCH-n1q+wLz">
                                                    <field name="VAR">personaje</field>
                                                  </block>
                                                </value>
                                                <value name="B">
                                                  <block type="math_number" id="Y{9cSGgM40X}]!jFdi:C">
                                                    <field name="NUM">2</field>
                                                  </block>
                                                </value>
                                              </block>
                                            </value>
                                            <statement name="DO1">
                                              <block type="text_print" id="q^*E_!(qFV7y`k;Mfcxy">
                                                <value name="TEXT">
                                                  <block type="text" id="C%(+I-7wdIpy(~VY?XI}">
                                                    <field name="TEXT">Tu personaje es el vampiro</field>
                                                  </block>
                                                </value>
                                                <next>
                                                  <block type="text_print" id="ycgRtJN*+#2b(4;]@#|3">
                                                    <value name="TEXT">
                                                      <block type="text_join" id="Zr7Clc@}k1Vc]UAM`rxp">
                                                        <mutation items="3"></mutation>
                                                        <value name="ADD0">
                                                          <block type="text" id="9`7fl2K:m,g:}Ue,]yk:">
                                                            <field name="TEXT">Tu vida es de: </field>
                                                          </block>
                                                        </value>
                                                        <value name="ADD1">
                                                          <block type="variables_get" id="oCp+0j5wu?l@B4jXn.iS">
                                                            <field name="VAR">vidaVampiro</field>
                                                          </block>
                                                        </value>
                                                        <value name="ADD2">
                                                          <block type="text" id="kg`qO1FM3F*4,V@EBFYA">
                                                            <field name="TEXT">pts.</field>
                                                          </block>
                                                        </value>
                                                      </block>
                                                    </value>
                                                  </block>
                                                </next>
                                              </block>
                                            </statement>
                                            <next>
                                              <block type="controls_whileUntil" id="o=KhBlZht`F}DDoBTAA/">
                                                <field name="MODE">UNTIL</field>
                                                <value name="BOOL">
                                                  <block type="logic_compare" id="-xEmY(g}(.IBwCK.(7J6">
                                                    <field name="OP">EQ</field>
                                                    <value name="A">
                                                      <block type="variables_get" id="n/A64!;hLq1fkUxyRx=;">
                                                        <field name="VAR">vidaVampiro</field>
                                                      </block>
                                                    </value>
                                                    <value name="B">
                                                      <block type="math_number" id="PO0FXbzL(DH/^|+yEy6R">
                                                        <field name="NUM">0</field>
                                                      </block>
                                                    </value>
                                                  </block>
                                                </value>
                                                <statement name="DO">
                                                  <block type="text_print" id="NR*c/EsGYLF7uP+3,(/H">
                                                    <value name="TEXT">
                                                      <block type="text" id="}[/FS9dM-6Ia/-o3NZhv">
                                                        <field name="TEXT">Turno del caballero</field>
                                                      </block>
                                                    </value>
                                                    <next>
                                                      <block type="variables_set" id="zd[6tv;DTnwqRWxQxmjO">
                                                        <field name="VAR">problabilidad</field>
                                                        <value name="VALUE">
                                                          <block type="math_random_int" id="(bg`d,MUazL+ZC```g:{">
                                                            <value name="FROM">
                                                              <block type="math_number" id="?[v*Zq(GQ6{.O|E_QZ(W">
                                                                <field name="NUM">1</field>
                                                              </block>
                                                            </value>
                                                            <value name="TO">
                                                              <block type="math_number" id="#Z_[ni^2/_plP!HAL(K{">
                                                                <field name="NUM">10</field>
                                                              </block>
                                                            </value>
                                                          </block>
                                                        </value>
                                                        <next>
                                                          <block type="controls_if" id="0h{xmnFc*W5QQ#mVYjFo">
                                                            <mutation else="1"></mutation>
                                                            <value name="IF0">
                                                              <block type="logic_compare" id="Riw_w1{~d*To7lF/t_D]">
                                                                <field name="OP">GT</field>
                                                                <value name="A">
                                                                  <block type="variables_get" id="e}=1-M.@7[^Jx*Vgq3b1">
                                                                    <field name="VAR">problabilidad</field>
                                                                  </block>
                                                                </value>
                                                                <value name="B">
                                                                  <block type="math_number" id="dmF~k{_=,q5a{vHG#z^*">
                                                                    <field name="NUM">5</field>
                                                                  </block>
                                                                </value>
                                                              </block>
                                                            </value>
                                                            <statement name="DO0">
                                                              <block type="text_print" id="K@-Fw9YdbsbO|EvY,xSZ">
                                                                <value name="TEXT">
                                                                  <block type="text" id="Y|`FsTQjjfxvmI9,FO~w">
                                                                    <field name="TEXT">El caballero acertó el golpe con su espada</field>
                                                                  </block>
                                                                </value>
                                                                <next>
                                                                  <block type="text_print" id="_X_D@}|-iq%Anct8/x(*">
                                                                    <value name="TEXT">
                                                                      <block type="text_join" id="K9a.xRl(rh6{36AR!Lct">
                                                                        <mutation items="3"></mutation>
                                                                        <value name="ADD0">
                                                                          <block type="text" id="L]1K2%unz(pe-.`VOK2)">
                                                                            <field name="TEXT">La vida del vampiro disminuyó: </field>
                                                                          </block>
                                                                        </value>
                                                                        <value name="ADD1">
                                                                          <block type="variables_get" id="mM~5P%@%p1[kfbZt}HBe">
                                                                            <field name="VAR">danoGolpe</field>
                                                                          </block>
                                                                        </value>
                                                                        <value name="ADD2">
                                                                          <block type="text" id="z+6ocWQX`BfVL4/x~5XQ">
                                                                            <field name="TEXT">pts.</field>
                                                                          </block>
                                                                        </value>
                                                                      </block>
                                                                    </value>
                                                                    <next>
                                                                      <block type="variables_set" id="!Na4#(kbqKhM(b!u/X/e">
                                                                        <field name="VAR">vidaVampiro</field>
                                                                        <value name="VALUE">
                                                                          <block type="math_arithmetic" id="Orol^K:x`|5M=fr(60~N">
                                                                            <field name="OP">MINUS</field>
                                                                            <value name="A">
                                                                              <block type="variables_get" id="ECg@(+gg3D5S;jq~E@q}">
                                                                                <field name="VAR">vidaVampiro</field>
                                                                              </block>
                                                                            </value>
                                                                            <value name="B">
                                                                              <block type="variables_get" id="*qxe#8[6l?EMMe69GVh)">
                                                                                <field name="VAR">danoGolpe</field>
                                                                              </block>
                                                                            </value>
                                                                          </block>
                                                                        </value>
                                                                        <next>
                                                                          <block type="text_print" id="@II.Jjw={e7T_I}P/z)K">
                                                                            <value name="TEXT">
                                                                              <block type="text_join" id="(XmSvjMt7KAs)e8u79qZ">
                                                                                <mutation items="2"></mutation>
                                                                                <value name="ADD0">
                                                                                  <block type="text" id="L8]PAlTGyQN/dT2jH9/_">
                                                                                    <field name="TEXT">Ahora la vida del vampiro es de: </field>
                                                                                  </block>
                                                                                </value>
                                                                                <value name="ADD1">
                                                                                  <block type="variables_get" id="_B]Z~{!?*s9.L3oLS85?">
                                                                                    <field name="VAR">vidaVampiro</field>
                                                                                  </block>
                                                                                </value>
                                                                              </block>
                                                                            </value>
                                                                          </block>
                                                                        </next>
                                                                      </block>
                                                                    </next>
                                                                  </block>
                                                                </next>
                                                              </block>
                                                            </statement>
                                                            <statement name="ELSE">
                                                              <block type="text_print" id=";#GF,tL|(U?h9OEz#hGf">
                                                                <value name="TEXT">
                                                                  <block type="text" id="F|XA+VM|ov^rk|EPFf)5">
                                                                    <field name="TEXT">El caballero erró su golpe</field>
                                                                  </block>
                                                                </value>
                                                              </block>
                                                            </statement>
                                                            <next>
                                                              <block type="text_print" id="m-wik*PjKA7Yp}#ggnMG">
                                                                <value name="TEXT">
                                                                  <block type="text" id="l%LS/@ylpH}-T}`62l+o">
                                                                    <field name="TEXT">Turno del vampiro</field>
                                                                  </block>
                                                                </value>
                                                                <next>
                                                                  <block type="controls_if" id="Cg}#(}F0o9fNJ]:5BooM">
                                                                    <mutation else="1"></mutation>
                                                                    <value name="IF0">
                                                                      <block type="logic_compare" id="/1a6@lO5@~oQRO?puNhf">
                                                                        <field name="OP">GTE</field>
                                                                        <value name="A">
                                                                          <block type="variables_get" id="~ewYs:pM#wO/HETWc#18">
                                                                            <field name="VAR">problabilidad</field>
                                                                          </block>
                                                                        </value>
                                                                        <value name="B">
                                                                          <block type="math_number" id="|vlqegqe]I9BtH3Aomdd">
                                                                            <field name="NUM">4</field>
                                                                          </block>
                                                                        </value>
                                                                      </block>
                                                                    </value>
                                                                    <statement name="DO0">
                                                                      <block type="text_print" id="A5e]54l/-6b%8+9UDWsa">
                                                                        <value name="TEXT">
                                                                          <block type="text" id="wZ1F?I=HVBD46[=T|,in">
                                                                            <field name="TEXT">El vampiro acertó su mordizco</field>
                                                                          </block>
                                                                        </value>
                                                                        <next>
                                                                          <block type="text_print" id="M,B621,y3RT#Fu:ImDYn">
                                                                            <value name="TEXT">
                                                                              <block type="text_join" id="/eaV)o%:2f]]A9ABW`%y">
                                                                                <mutation items="3"></mutation>
                                                                                <value name="ADD0">
                                                                                  <block type="text" id="HcFZ6wZ[A_x2T_`AUkUf">
                                                                                    <field name="TEXT">La vida del caballero disminuyó: </field>
                                                                                  </block>
                                                                                </value>
                                                                                <value name="ADD1">
                                                                                  <block type="variables_get" id="J?n+c2E~AsnQl#w1b]JI">
                                                                                    <field name="VAR">danoMordida</field>
                                                                                  </block>
                                                                                </value>
                                                                                <value name="ADD2">
                                                                                  <block type="text" id="9*SA_W^JOR;Y`-?sQ[eB">
                                                                                    <field name="TEXT">pts.</field>
                                                                                  </block>
                                                                                </value>
                                                                              </block>
                                                                            </value>
                                                                            <next>
                                                                              <block type="variables_set" id="DI}iO[.[(2sb}:Cz/%T1">
                                                                                <field name="VAR">vidaHeroe</field>
                                                                                <value name="VALUE">
                                                                                  <block type="math_arithmetic" id="85hIV%U/Hp%tpdG%;`l!">
                                                                                    <field name="OP">MINUS</field>
                                                                                    <value name="A">
                                                                                      <block type="variables_get" id="Hjg~=y0RpgHWC(/.hgPJ">
                                                                                        <field name="VAR">vidaHeroe</field>
                                                                                      </block>
                                                                                    </value>
                                                                                    <value name="B">
                                                                                      <block type="variables_get" id="mwhSBmb|{-]UvAV*+8S+">
                                                                                        <field name="VAR">danoMordida</field>
                                                                                      </block>
                                                                                    </value>
                                                                                  </block>
                                                                                </value>
                                                                                <next>
                                                                                  <block type="text_print" id="2[YRNIQ}C69yFlALzifc">
                                                                                    <value name="TEXT">
                                                                                      <block type="text_join" id="Gznv,|z5t{O7ZQF+ieP6">
                                                                                        <mutation items="2"></mutation>
                                                                                        <value name="ADD0">
                                                                                          <block type="text" id="]-U1^qh{hTN64o{d;*{;">
                                                                                            <field name="TEXT">Ahora la vida del caballero es de: </field>
                                                                                          </block>
                                                                                        </value>
                                                                                        <value name="ADD1">
                                                                                          <block type="variables_get" id="ns{]-sd-m*bk.X|5T#T6">
                                                                                            <field name="VAR">vidaHeroe</field>
                                                                                          </block>
                                                                                        </value>
                                                                                      </block>
                                                                                    </value>
                                                                                  </block>
                                                                                </next>
                                                                              </block>
                                                                            </next>
                                                                          </block>
                                                                        </next>
                                                                      </block>
                                                                    </statement>
                                                                    <statement name="ELSE">
                                                                      <block type="text_print" id="G*?E:([!(8}t;KKN[v^|">
                                                                        <value name="TEXT">
                                                                          <block type="text" id="?S/*u;]Fy9``.]unyA+P">
                                                                            <field name="TEXT">El vampiro erró su mordizco</field>
                                                                          </block>
                                                                        </value>
                                                                      </block>
                                                                    </statement>
                                                                    <next>
                                                                      <block type="controls_if" id="uj0@kjvK{gYu|0Zv@XO|">
                                                                        <mutation elseif="1"></mutation>
                                                                        <value name="IF0">
                                                                          <block type="logic_compare" id="rByV7^cueT=MVOe+gcOi">
                                                                            <field name="OP">LTE</field>
                                                                            <value name="A">
                                                                              <block type="variables_get" id="MVg_NUM_z:tk3|U2GNg~">
                                                                                <field name="VAR">vidaVampiro</field>
                                                                              </block>
                                                                            </value>
                                                                            <value name="B">
                                                                              <block type="math_number" id="132R%cmO.t1BC,%S~W@4">
                                                                                <field name="NUM">0</field>
                                                                              </block>
                                                                            </value>
                                                                          </block>
                                                                        </value>
                                                                        <statement name="DO0">
                                                                          <block type="text_print" id="vp%:eKMlVwo/7b1HyMPb">
                                                                            <value name="TEXT">
                                                                              <block type="text" id="_+@[pz5?RwHuv6KLwmhD">
                                                                                <field name="TEXT">El vampiro ha muerto</field>
                                                                              </block>
                                                                            </value>
                                                                          </block>
                                                                        </statement>
                                                                        <value name="IF1">
                                                                          <block type="logic_compare" id="%]e:2{%A9w}UzK[IRkyy">
                                                                            <field name="OP">LTE</field>
                                                                            <value name="A">
                                                                              <block type="variables_get" id="/(!(t(Dj,sh(k#;;n?r]">
                                                                                <field name="VAR">vidaHeroe</field>
                                                                              </block>
                                                                            </value>
                                                                            <value name="B">
                                                                              <block type="math_number" id="M|`KWCp)cdCFASyKti1u">
                                                                                <field name="NUM">0</field>
                                                                              </block>
                                                                            </value>
                                                                          </block>
                                                                        </value>
                                                                        <statement name="DO1">
                                                                          <block type="text_print" id="^fF-lcwJ~TsxB+GYy236">
                                                                            <value name="TEXT">
                                                                              <block type="text" id="`GA|5UW=sWbNFo%bss/(">
                                                                                <field name="TEXT">El caballero ha muerto</field>
                                                                              </block>
                                                                            </value>
                                                                          </block>
                                                                        </statement>
                                                                      </block>
                                                                    </next>
                                                                  </block>
                                                                </next>
                                                              </block>
                                                            </next>
                                                          </block>
                                                        </next>
                                                      </block>
                                                    </next>
                                                  </block>
                                                </statement>
                                              </block>
                                            </next>
                                          </block>
                                        </next>
                                      </block>
                                    </next>
                                  </block>
                                </next>
                              </block>
                            </next>
                          </block>
                        </next>
                      </block>
                    </next>
                  </block>
                </next>
              </block>
            </next>
          </block>
        </next>
      </block>
    </next>
  </block>
</xml>