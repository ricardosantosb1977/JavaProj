object frmTesteGrid: TfrmTesteGrid
  Left = 192
  Top = 125
  Width = 335
  Height = 368
  Caption = 'frmTesteGrid'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  Position = poScreenCenter
  OnShow = FormShow
  PixelsPerInch = 96
  TextHeight = 13
  object Label1: TLabel
    Left = 16
    Top = 9
    Width = 37
    Height = 13
    Caption = 'Ve'#237'culo'
  end
  object Label2: TLabel
    Left = 152
    Top = 9
    Width = 27
    Height = 13
    Caption = 'Placa'
  end
  object DBGrid1: TDBGrid
    Left = 16
    Top = 48
    Width = 288
    Height = 265
    DataSource = DataSource1
    TabOrder = 3
    TitleFont.Charset = DEFAULT_CHARSET
    TitleFont.Color = clWindowText
    TitleFont.Height = -11
    TitleFont.Name = 'MS Sans Serif'
    TitleFont.Style = []
    OnCellClick = DBGrid1CellClick
    Columns = <
      item
        Expanded = False
        FieldName = 'Veiculo'
        Visible = True
      end
      item
        Expanded = False
        FieldName = 'Placa'
        Visible = True
      end
      item
        Expanded = False
        FieldName = 'Vendido'
        Width = 59
        Visible = True
      end>
  end
  object Veiculo: TEdit
    Left = 16
    Top = 24
    Width = 133
    Height = 21
    CharCase = ecUpperCase
    TabOrder = 0
  end
  object Placa: TEdit
    Left = 152
    Top = 24
    Width = 65
    Height = 21
    CharCase = ecUpperCase
    TabOrder = 1
  end
  object Incluir: TButton
    Left = 221
    Top = 21
    Width = 60
    Height = 25
    Caption = 'Incluir'
    TabOrder = 2
    OnClick = IncluirClick
  end
  object cdsVeiculos: TClientDataSet
    Active = True
    Aggregates = <>
    Params = <>
    Left = 56
    Top = 216
    Data = {
      6C0000009619E0BD0100000018000000030000000000030000006C0007566569
      63756C6F010049000000010005574944544802000200140005506C6163610100
      490000000100055749445448020002000A000756656E6469646F010049000000
      01000557494454480200020003000000}
    object cdsVeiculosVeiculo: TStringField
      FieldName = 'Veiculo'
    end
    object cdsVeiculosPlaca: TStringField
      FieldName = 'Placa'
      Size = 10
    end
    object cdsVeiculosVendido: TStringField
      FieldName = 'Vendido'
      Size = 3
    end
  end
  object DataSource1: TDataSource
    DataSet = cdsVeiculos
    Left = 128
    Top = 216
  end
end
