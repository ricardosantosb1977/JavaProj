unit uTesteGrid;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, MidasLib, DB, DBClient, Grids, DBGrids, StdCtrls;

type
  TfrmTesteGrid = class(TForm)
    cdsVeiculos: TClientDataSet;
    DataSource1: TDataSource;
    DBGrid1: TDBGrid;
    cdsVeiculosVeiculo: TStringField;
    cdsVeiculosPlaca: TStringField;
    cdsVeiculosVendido: TStringField;
    Label1: TLabel;
    Veiculo: TEdit;
    Label2: TLabel;
    Placa: TEdit;
    Incluir: TButton;
    procedure IncluirClick(Sender: TObject);
    procedure DBGrid1CellClick(Column: TColumn);
    procedure FormShow(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
    procedure CarregaCombo;
  end;

var
  frmTesteGrid: TfrmTesteGrid;

implementation

{$R *.dfm}

procedure TfrmTesteGrid.CarregaCombo;
begin
  DBGrid1.Columns[2].PickList.Text := 'Sim' + #13#10 + 'N�o';
end;

procedure TfrmTesteGrid.IncluirClick(Sender: TObject);
begin
  cdsVeiculos.Insert;
  cdsVeiculosVeiculo.AsString := Veiculo.Text;
  cdsVeiculosPlaca.AsString := Placa.Text;
  cdsVeiculosVendido.AsString := 'N�o';
  cdsVeiculos.Post;
end;

procedure TfrmTesteGrid.DBGrid1CellClick(Column: TColumn);
begin
  if Column.PickList.Count > 0 then
  begin
    keybd_event(VK_F2,0,0,0);
    keybd_event(VK_F2,0,KEYEVENTF_KEYUP,0);
    keybd_event(VK_MENU,0,0,0);
    keybd_event(VK_DOWN,0,0,0);
    keybd_event(VK_DOWN,0,KEYEVENTF_KEYUP,0);
    keybd_event(VK_MENU,0,KEYEVENTF_KEYUP,0);
  end;
end;

procedure TfrmTesteGrid.FormShow(Sender: TObject);
begin
  CarregaCombo;
end;

end.