program projGrig;

uses
  Forms,
  uTesteGrid in 'uTesteGrid.pas' {frmTesteGrid};

{$R *.res}

begin
  Application.Initialize;
  Application.CreateForm(TfrmTesteGrid, frmTesteGrid);
  Application.Run;
end.
